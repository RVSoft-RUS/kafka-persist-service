package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;

public interface DataService {
    void process(SberDataCloudFormattedMessage<?> message);
}
