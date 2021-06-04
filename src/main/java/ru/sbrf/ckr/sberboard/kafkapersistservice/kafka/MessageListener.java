package ru.sbrf.ckr.sberboard.kafkapersistservice.kafka;

import org.springframework.stereotype.Component;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import ru.sbrf.ckr.sberboard.kafkapersistservice.utils.Utils;

@Component
public class MessageListener {
    @Autowired
    TopicHelper topicHelper;

    @Autowired
    private DataService dataService;

    @Autowired
    private KafkaAuditService auditService;

    @KafkaListener(groupId = "${kafka.group}", topics = "#{topicHelper.getTopics()}", containerFactory = "singleFactory")
    public void listener(SberDataCloudFormattedMessage<?> message) {
        try {
            dataService.process(message);
        } catch (Exception e) {
            auditService.sendError(message, e);
        }
    }
}
