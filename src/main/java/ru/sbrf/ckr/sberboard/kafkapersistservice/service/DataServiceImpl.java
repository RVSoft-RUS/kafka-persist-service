package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.CxTxbLogStat;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.CxTxbLogStatRepository;

@Service
public class DataServiceImpl implements DataService {
    private final CxTxbLogStatRepository repository;

    public DataServiceImpl(CxTxbLogStatRepository repository) {
        this.repository = repository;
    }

    @Autowired
    ObjectMapper mapper;

    @Override
    public void process(SberDataCloudFormattedMessage formattedMessage) {
        System.out.println("Save object: " + formattedMessage);
        if (!formattedMessage.getTable().equalsIgnoreCase("cxTxbLogStat")) {
            System.out.println("Не соответствует имя таблицы.");
            return;
        }

        switch (OperationType.valueOf(formattedMessage.getOp_type())) {
            case I:
            case U:
                CxTxbLogStat statAfter = mapper.convertValue(formattedMessage.getAfter(), CxTxbLogStat.class);
                repository.save(statAfter);
                break;
            case D:
                CxTxbLogStat statBefor = mapper.convertValue(formattedMessage.getBefore(), CxTxbLogStat.class);
                repository.delete(statBefor);
        }

    }
}
