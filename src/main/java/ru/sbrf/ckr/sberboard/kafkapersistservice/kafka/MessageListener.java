package ru.sbrf.ckr.sberboard.kafkapersistservice.kafka;

import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {
    @Autowired
    private DataService dataService;

    @KafkaListener(groupId = "g1", topics = "${kafka.topic.name}", containerFactory = "singleFactory")
    public void listener(SberDataCloudFormattedMessage message) {
        dataService.process(message);
    }
}
