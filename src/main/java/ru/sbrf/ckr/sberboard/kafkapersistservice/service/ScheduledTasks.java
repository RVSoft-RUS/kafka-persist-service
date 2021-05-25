package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.SubTypeIdAuditEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.KafkaLoggingService;

import java.time.LocalDateTime;

@Service
public class ScheduledTasks {
    @Autowired
    private KafkaLoggingService loggingService;

    @Autowired
    private KafkaAuditService auditService;

    @EventListener(ApplicationReadyEvent.class)
    public void afterInit() {
        auditService.send("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Start service at ".concat(LocalDateTime.now()
                        .toString()), SubTypeIdAuditEvent.F0.name());
    }

}
