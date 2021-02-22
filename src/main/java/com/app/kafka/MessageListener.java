package com.app.kafka;

import com.app.service.DataService;
import com.app.model.CxTxbLogStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {
    @Autowired
    private DataService dataService;

    @KafkaListener(groupId = "g1", topics = "${kafka.topic.name}", containerFactory = "singleFactory")
    public void listener(CxTxbLogStat cxTxbLogStat) {
        dataService.saveMessage(cxTxbLogStat);
    }
}
