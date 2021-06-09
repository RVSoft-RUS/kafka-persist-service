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
import ru.sbrf.ckr.sberboard.kafkapersistservice.utils.Utils;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfiguration {

    public static final String SBERBOARD_SERVICE_ID_CONFIG = "sberboard-service-client";
    public static final String SBERBOARD_SERVICE_TRANSACTIONAL_ID_CONFIG = "sberboard-service-transactional-id";
    public static final String SECURITY_PROTOCOL_VALUE = Utils.getJNDIValue("java:comp/env/kafkaAudit/SecurityProtocol");
    public static final String SBERBOARD_SERVICE_TRANSACTIONAL_ID = "sberboard-service-transactional-id";
    public static final String ACKS_CONFIG = "all";
    public static final String TRUST_STORE_LOCATION = Utils.getJNDIValue("java:comp/env/kafkaSSL/trustStoreLocation");
    public static final String TRUST_STORE_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/trustStorePassword");
    public static final String KEY_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyPassword");
    public static final String KEY_STORE_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyStorePassword");
    public static final String KEY_STORE_LOCATION = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyStoreLocation");

//    private static final Logger logger = LogManager.getLogger("KafkaConfiguration");

    @Bean
    public ProducerFactory<String, String> producerFactory() {
        String bootstrapServers = Utils.getJNDIValue("java:comp/env/kafkaAudit/bootstrapServers");

        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.ACKS_CONFIG, ACKS_CONFIG);
        configProps.put(ProducerConfig.CLIENT_ID_CONFIG, SBERBOARD_SERVICE_ID_CONFIG);
        configProps.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, SBERBOARD_SERVICE_TRANSACTIONAL_ID_CONFIG);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put("ssl.endpoint.identification.algorithm", "");
        configProps.put("security.protocol", SECURITY_PROTOCOL_VALUE);
        configProps.put("ssl.truststore.location", TRUST_STORE_LOCATION);
        configProps.put("ssl.truststore.password", TRUST_STORE_PASSWORD);
        configProps.put("ssl.key.password", KEY_PASSWORD);
        configProps.put("ssl.keystore.password", KEY_STORE_PASSWORD);
        configProps.put("ssl.keystore.location", KEY_STORE_LOCATION);

        DefaultKafkaProducerFactory<String, String> producer = new DefaultKafkaProducerFactory<>(configProps);
        producer.setTransactionIdPrefix(SBERBOARD_SERVICE_TRANSACTIONAL_ID);
        return producer;
    }

    @Bean
    public KafkaSettings getKafkaSettings(){
        String topicName = Utils.getJNDIValue("java:comp/env/kafkaAudit/topicName");
        String modeId = Utils.getJNDIValue("java:comp/env/kafkaAudit/modeId");
        String appId = Utils.getJNDIValue("java:comp/env/kafka/appId");
        String bootstrapServers = Utils.getJNDIValue("java:comp/env/kafkaAudit/bootstrapServers");
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
    public KafkaTransactionManager<String, String> kafkaTransactionManager() {
        return new KafkaTransactionManager<>(producerFactory());
    }
}
