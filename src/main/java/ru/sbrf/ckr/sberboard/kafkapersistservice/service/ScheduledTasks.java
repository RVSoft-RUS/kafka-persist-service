package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.SubTypeIdAuditEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduledTasks {
//    private final KafkaLoggingService loggingService;
    private final KafkaAuditService auditService;

    private final CxDepositRepository cxDepositRepository;
    private final CxTxbHistRepository cxTxbHistRepository;
    private final CxTxbEvtRepository cxTxbEvtRepository;
    private final CxTxbLogStatRepository cxTxbLogStatRepository;
    private final SSrvReqXRepository sSrvReqXRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void afterInit() {
        auditService.send("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Start service at ".concat(LocalDateTime.now()
                        .toString()), SubTypeIdAuditEvent.F0.name());
    }

    @EventListener(ApplicationFailedEvent.class)
    public void failedApplication() {
        auditService.send("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ STOP??? service at ".concat(LocalDateTime.now()
                .toString()), SubTypeIdAuditEvent.F0.name());
    }

    @Scheduled(cron = "0 0 3 * * *")
    public void deleteData() {
        LocalDateTime deleteDate = LocalDateTime.now().minusDays(1).toLocalDate().atStartOfDay();
        auditService.send("Delete data by CtlValidfrom before " + deleteDate.toString(), SubTypeIdAuditEvent.C0.name());
        List<DeleteByCtlValidfromBefore> repositories =
                Arrays.asList(cxDepositRepository, cxTxbHistRepository,
                        cxTxbEvtRepository, cxTxbLogStatRepository, sSrvReqXRepository);
        repositories.forEach(repo -> repo.deleteByCtlValidfromBefore(deleteDate));
    }
}
