package ru.sbrf.ckr.sberboard.kafkapersistservice.config.kafkaconsumer;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;
import ru.sbrf.ckr.sberboard.kafkapersistservice.utils.Utils;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public KafkaAdmin kafkaAdmin() {
        String bootstrapAddress = Utils.getJNDIValue("java:comp/env/kafkaConsumer/bootstrapAddress");
        Map<String, Object> config = new HashMap<>();
        config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);

        return new KafkaAdmin(config);
    }

//    @Bean
//    public NewTopic topic() {
//        return new NewTopic(topicName, 1, (short) 1);
//    }
}
