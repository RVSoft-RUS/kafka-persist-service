package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.*;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.KafkaLoggingService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.model.TopicEntityRepoLink;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

@Service

public class DataServiceImpl implements DataService {
    private final TopicEntityRepoLink topicEntityRepoLink = new TopicEntityRepoLink();

    public DataServiceImpl(CxTxbEvtRepository cxTxbEvtRepository,
                           CxTxbHistRepository cxTxbHistRepository,
                           CxTxbLogStatRepository cxTxbLogStatRepository,
                           CxDepositRepository cxDepositRepository,
                           SSrvReqXRepository sSrvReqXRepository,
                           CxCommMsgRepository cxCommMsgRepository,
                           CxSrConclRepository cxSrConclRepository,
                           CxSrEmpRepository cxSrEmpRepository,
                           CxSrExpertiseRepository cxSrExpertiseRepository,
                           SSrvReqRepository sSrvReqRepository
    ) {
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", CxTxbEvt.class, cxTxbEvtRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", CxTxbHist.class, cxTxbHistRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", CxTxbLogStat.class, cxTxbLogStatRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_DEPOSIT", CxDeposit.class, cxDepositRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_S_SRV_REQ_X", SSrvReqX.class, sSrvReqXRepository);

        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_COMM_MSG", CxCommMsg.class, cxCommMsgRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_CONCL", CxSrConcl.class, cxSrConclRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_EMP", CxSrEmp.class, cxSrEmpRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_SR_EXPERTISE", CxSrExpertise.class, cxSrExpertiseRepository);
        topicEntityRepoLink.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_S_SRV_REQ", SSrvReq.class, sSrvReqRepository);

    }

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
