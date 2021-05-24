package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit.KafkaAuditService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.KafkaLoggingService;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging.SubTypeIdLoggingEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.repository.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class DeleteDataService {

    @Autowired
    private KafkaLoggingService loggingService;

    @Autowired
    private KafkaAuditService auditService;

    private List<DeleteByCtlValidfromBefore> repositories;

    public DeleteDataService(CxDepositRepository cxDepositRepository,
                             CxTxbHistRepository cxTxbHistRepository,
                             CxTxbEvtRepository cxTxbEvtRepository,
                             CxTxbLogStatRepository cxTxbLogStatRepository,
                             SSrvReqXRepository sSrvReqXRepository
    ) {
        repositories = Arrays.asList(cxDepositRepository, cxTxbHistRepository
                , cxTxbEvtRepository, cxTxbLogStatRepository, sSrvReqXRepository);
    }

    @Scheduled(cron = "0 0 3 * * *")
    public void deleteData() {
        LocalDateTime deleteDate = LocalDateTime.now().minusDays(1).toLocalDate().atStartOfDay();
        loggingService.send("Delete data by CtlValidfrom before " + deleteDate.toString(), SubTypeIdLoggingEvent.DEBUG.name());
        repositories.stream().forEach(repositories -> {
            repositories.deleteByCtlValidfromBefore(deleteDate);
        });
    }
}
