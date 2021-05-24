package ru.sbrf.ckr.sberboard.kafkapersistservice.repository;

import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

public interface DeleteByCtlValidfromBefore {
    @Transactional
    void deleteByCtlValidfromBefore(LocalDateTime dateTime);
}
