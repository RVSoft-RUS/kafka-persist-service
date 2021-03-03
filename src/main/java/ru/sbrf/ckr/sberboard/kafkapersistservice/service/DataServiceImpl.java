package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.CxTxbLogStatRepository;

@Service
public class DataServiceImpl implements DataService {
    private final CxTxbLogStatRepository repository;

    public DataServiceImpl(CxTxbLogStatRepository repository) {
        this.repository = repository;
    }

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
                repository.save(formattedMessage.getAfter());
                break;
            case D:
                repository.delete(formattedMessage.getBefore());
        }

    }
}
