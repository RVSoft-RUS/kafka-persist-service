package ru.sbrf.ckr.sberboard.kafkapersistservice.kafka;

import org.springframework.stereotype.Component;
import ru.sbrf.ckr.sberboard.kafkapersistservice.utils.Utils;

@Component
public class TopicHelper {
    private static final String topics = Utils.getJNDIValue("java:comp/env/kafkaConsumer/topics");

    public String[] getTopics() {
        return topics.split(",");
    }
}
