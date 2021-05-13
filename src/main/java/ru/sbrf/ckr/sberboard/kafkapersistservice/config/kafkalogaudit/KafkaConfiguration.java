package ru.sbrf.ckr.sberboard.kafkapersistservice.config.kafkalogaudit;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.transaction.KafkaTransactionManager;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfiguration {

    public static final String SBERBOARD_SERVICE_ID_CONFIG = "sberboard-service-client";
    public static final String SBERBOARD_SERVICE_TRANSACTIONAL_ID_CONFIG = "sberboard-service-transactional-id";
    public static final String SECURITY_PROTOCOL_VALUE = "PLAINTEXT";
    public static final String SBERBOARD_SERVICE_TRANSACTIONAL_ID = "sberboard-service-transactional-id";
    public static final String ACKS_CONFIG = "all";

//    private static final Logger logger = LogManager.getLogger("KafkaConfiguration");

    @Bean
    public ProducerFactory<String, String> producerFactory() {
        String bootstrapServers = "10.53.223.8:9092, 10.53.223.204:9092, 10.53.223.63:9092";
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.ACKS_CONFIG, ACKS_CONFIG);
        configProps.put(ProducerConfig.CLIENT_ID_CONFIG, SBERBOARD_SERVICE_ID_CONFIG);
        configProps.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, SBERBOARD_SERVICE_TRANSACTIONAL_ID_CONFIG);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put("security.protocol", SECURITY_PROTOCOL_VALUE);
        DefaultKafkaProducerFactory<String, String> producer = new DefaultKafkaProducerFactory<>(configProps);
        producer.setTransactionIdPrefix(SBERBOARD_SERVICE_TRANSACTIONAL_ID);
        return producer;
    }

    @Bean
    public KafkaSettings getKafkaSettings(){
//        String topicName = Utils.getJNDIValue("java:comp/env/kafka/topicName");
        String topicName = "sbrdservice-ser-421a-b27e-817a2339cb54";
//        String modeId = Utils.getJNDIValue("java:comp/env/kafka/modeId");
        String modeId = "SBERBOARD-PERSIST-AGENT";
//        String appId = Utils.getJNDIValue("java:comp/env/kafka/appId");
        String appId = "sbrdservice-ser-421a-b27e-817a2339cb54";
//        String bootstrapServers = Utils.getJNDIValue("java:comp/env/kafka/bootstrapServers");
        String bootstrapServers = "10.53.223.8:9092, 10.53.223.204:9092, 10.53.223.63:9092";
        KafkaSettings kafkaSettings = new KafkaSettings();
        kafkaSettings.setAppId(appId);
        kafkaSettings.setModeId(modeId);
        kafkaSettings.setTopicName(topicName);
        kafkaSettings.setBootstrapServers(bootstrapServers);
        return kafkaSettings;
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    @Bean
    @Qualifier("kafkaTransactionManager")
//    @Qualifier("transactionManager")
    public KafkaTransactionManager<String, String> kafkaTransactionManager() {
        return new KafkaTransactionManager<>(producerFactory());
    }
}
