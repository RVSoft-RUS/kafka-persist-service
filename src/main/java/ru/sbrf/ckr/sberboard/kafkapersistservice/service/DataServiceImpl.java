package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

import javax.persistence.Entity;
import java.util.HashMap;

@Service
public class DataServiceImpl implements DataService {
    private HashMap<String, CrudRepository> repositoryHashMap;
    private static HashMap<String, String> entityHashMap;

    public DataServiceImpl(CxTxbCallJrnRepository cxTxbCallJrnRepository,
                           CxTxbEvtRepository cxTxbEvtRepository,
                           CxTxbHistRepositiry cxTxbHistRepositiry,
                           CxTxbLogStatRepository cxTxbLogStatRepository,
                           CxTxbListLvlRepository cxTxbListLvlRepository,
                           CxTxbScheduleRepository cxTxbScheduleRepository,
                           CxTxbSmenyRepository cxTxbSmenyRepository,
                           CxTxbTimeOffRepository cxTxbTimeOffRepository
    ) {
        repositoryHashMap = new HashMap<>();
        entityHashMap = new HashMap<>();
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_CALL_JRN", cxTxbCallJrnRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", cxTxbEvtRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", cxTxbHistRepositiry);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LIST_LVL", cxTxbListLvlRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", cxTxbLogStatRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SCHEDULE", cxTxbScheduleRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SMENY", cxTxbSmenyRepository);
        repositoryHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_TIME_OFF", cxTxbTimeOffRepository);
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_CALL_JRN", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbCallJrn");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_EVT", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbEvt");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_HIST", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbHist");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LIST_LVL", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbListLvl");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_LOG_STAT", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SCHEDULE", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbSchedule");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_SMENY", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbSmeny");
        entityHashMap.put("NRT_CRM_CORP.delta-crm_corp-SIEBEL_CX_TXB_TIME_OFF", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbTimeOff");

    }

    @Autowired
    ObjectMapper mapper;

    @Override
    public void process(SberDataCloudFormattedMessage formattedMessage) {
//        System.out.println("Save object: " + formattedMessage);
//        if (!formattedMessage.getTable().equalsIgnoreCase("cxTxbLogStat")) {
//            System.out.println("Не соответствует имя таблицы.");
//            return;
//        }

        switch (OperationType.valueOf(formattedMessage.getOp_type())) {
            case I:
            case U:
                try {
                    repositoryHashMap.get(formattedMessage.getTable()).save(mapper.convertValue(formattedMessage.getAfter(), Class.forName(entityHashMap.get(formattedMessage.getTable()))));
                    System.out.println("Saved object: " + formattedMessage);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case D:
                try {
                    repositoryHashMap.get(formattedMessage.getTable()).delete(mapper.convertValue(formattedMessage.getBefore(), Class.forName(entityHashMap.get(formattedMessage.getTable()))));
                    System.out.println("Deleted object: " + formattedMessage);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }

    }
}
