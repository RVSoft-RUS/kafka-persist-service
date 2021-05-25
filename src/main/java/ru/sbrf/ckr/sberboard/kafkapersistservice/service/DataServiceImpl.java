package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.KafkaLoggingService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.SubTypeIdLoggingEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

import java.util.HashMap;

@Service

public class DataServiceImpl implements DataService {
    private final HashMap<String, CrudRepository> repositoryHashMap;
    private static HashMap<String, String> entityHashMap;

    public DataServiceImpl(CxTxbEvtRepository cxTxbEvtRepository,
                           CxTxbHistRepository cxTxbHistRepository,
                           CxTxbLogStatRepository cxTxbLogStatRepository,
                           CxDepositRepository cxDepositRepository,
                           SSrvReqXRepository sSrvReqXRepository
    ) {
        repositoryHashMap = new HashMap<>();
        entityHashMap = new HashMap<>();
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", cxTxbEvtRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", cxTxbHistRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", cxTxbLogStatRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_DEPOSIT", cxDepositRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_S_SRV_REQ_X", sSrvReqXRepository);
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbEvt");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbHist");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat");
        //toDo Добавить поддержку 2х новых таблиц, Добавить 2 новых топика
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_?", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxDeposit");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_??", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SSrvReqX");

    }

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private KafkaLoggingService loggingService;

    @Autowired
    private KafkaAuditService auditService;

    @Override
    public void process(SberDataCloudFormattedMessage<?> formattedMessage) {
        switch (OperationType.valueOf(formattedMessage.getOp_type())) {
            case I:
            case U:
                try {
                    repositoryHashMap.get(formattedMessage.getTable())
                            .save(mapper.convertValue(formattedMessage.getAfter(), Class.forName(entityHashMap.get(formattedMessage.getTable()))));
                    loggingService.send("Saved object: " + formattedMessage, SubTypeIdLoggingEvent.DEBUG.name());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case D:
                try {
                    repositoryHashMap.get(formattedMessage.getTable())
                            .delete(mapper.convertValue(formattedMessage.getBefore(), Class.forName(entityHashMap.get(formattedMessage.getTable()))));
                    loggingService.send("Deleted object: " + formattedMessage, SubTypeIdLoggingEvent.DEBUG.name());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }
    }
}
