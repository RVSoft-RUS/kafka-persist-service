package ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.audit;

import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaSenderService;

@Service
public class KafkaAuditService extends KafkaSenderService {

    protected KafkaEvent getEvent(String message, String subTypeId, String modeId) {
        return getEvent("Audit", message, subTypeId, modeId);
    }
}
