package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.CxTxbLogStatRepository;

import javax.management.BadAttributeValueExpException;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private CxTxbLogStatRepository repository;
    @Override
    public void process(SberDataCloudFormattedMessage formattedMessage) {
        System.out.println("Save object:");
        System.out.println(formattedMessage.getOp_ts());
        System.out.println(formattedMessage.getPos());
        if (!formattedMessage.getTable().equalsIgnoreCase("cx_txb_log_stat")) {
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
