package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;

import javax.management.BadAttributeValueExpException;

public interface DataService {
    void process(SberDataCloudFormattedMessage message);
}
