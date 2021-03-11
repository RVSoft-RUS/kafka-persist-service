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
        repositoryHashMap.put("cxTxbCallJrn", cxTxbCallJrnRepository);
        repositoryHashMap.put("cxTxbEvt", cxTxbEvtRepository);
        repositoryHashMap.put("cxTxbHist", cxTxbHistRepositiry);
        repositoryHashMap.put("cxTxbListLvl", cxTxbListLvlRepository);
        repositoryHashMap.put("cxTxbLogStat", cxTxbLogStatRepository);
        repositoryHashMap.put("cxTxbSchedule", cxTxbScheduleRepository);
        repositoryHashMap.put("cxTxbSmeny", cxTxbSmenyRepository);
        repositoryHashMap.put("cxTxbTimeOff", cxTxbTimeOffRepository);
        entityHashMap.put("cxTxbCallJrn", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbCallJrn");
        entityHashMap.put("cxTxbEvt", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbEvt");
        entityHashMap.put("cxTxbHist", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbHist");
        entityHashMap.put("cxTxbListLvl", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbListLvl");
        entityHashMap.put("cxTxbLogStat", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat");
        entityHashMap.put("cxTxbSchedule", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbSchedule");
        entityHashMap.put("cxTxbSmeny", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbSmeny");
        entityHashMap.put("cxTxbTimeOff", "ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbTimeOff");

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
