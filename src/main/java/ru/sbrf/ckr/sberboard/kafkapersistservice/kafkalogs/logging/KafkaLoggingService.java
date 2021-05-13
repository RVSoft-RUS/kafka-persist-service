package ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.logging;

import org.springframework.stereotype.Service;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaEvent;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafkalogs.abstractkafka.KafkaSenderService;

@Service
public class KafkaLoggingService extends KafkaSenderService {

    protected KafkaEvent getEvent(String message, String subTypeId, String modeId) {
        return getEvent("Tech", message, subTypeId, modeId);
    }
}
