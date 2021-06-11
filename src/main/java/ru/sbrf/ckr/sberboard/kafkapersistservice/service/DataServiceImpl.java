package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.*;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.KafkaLoggingService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.model.TopicEntityRepoLink;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private TopicEntityRepoLink topicEntityRepoLink;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private KafkaLoggingService loggingService;

    @Autowired
    private KafkaAuditService auditService;

    @Override
    public void process(SberDataCloudFormattedMessage<?> formattedMessage) {
        CrudRepository repository = topicEntityRepoLink.getRepo(formattedMessage.getTable());

        switch (OperationType.valueOf(formattedMessage.getOp_type())) {
            case I:
            case U: {
                MessageObject messageObject = (MessageObject) mapper.convertValue(formattedMessage.getAfter(),
                        topicEntityRepoLink.getEntity(formattedMessage.getTable()));
                if (messageObject.getUnknownFields() != null && !messageObject.getUnknownFields().isEmpty()) {
                    auditService.sendExtraFields(formattedMessage, messageObject);
                }
                repository.save(messageObject);
                auditService.sendOperationMessage(formattedMessage);
            }
            break;
            case D:
                MessageObject messageObject = (MessageObject) mapper.convertValue(formattedMessage.getBefore(),
                        topicEntityRepoLink.getEntity(formattedMessage.getTable()));
                repository.delete(messageObject);
                auditService.sendOperationMessage(formattedMessage);
        }
    }
}
