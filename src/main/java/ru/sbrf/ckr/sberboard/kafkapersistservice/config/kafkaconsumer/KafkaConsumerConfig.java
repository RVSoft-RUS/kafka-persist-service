package ru.sbrf.ckr.sberboard.kafkapersistservice.config.kafkaconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.SberDataCloudFormattedMessage;
import ru.sbrf.ckr.sberboard.kafkapersistservice.utils.Utils;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumerConfig {
    private static final String bootstrapAddress = Utils.getJNDIValue("java:comp/env/kafkaConsumer/bootstrapAddress");
    private static final String SECURITY_PROTOCOL_VALUE = Utils.getJNDIValue("java:comp/env/kafkaConsumer/SecurityProtocol");
    private static final String TRUST_STORE_LOCATION = Utils.getJNDIValue("java:comp/env/kafkaSSL/trustStoreLocation");
    private static final String TRUST_STORE_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/trustStorePassword");
    private static final String KEY_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyPassword");
    private static final String KEY_STORE_PASSWORD = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyStorePassword");
    private static final String KEY_STORE_LOCATION = Utils.getJNDIValue("java:comp/env/kafkaSSL/keyStoreLocation");

    @Value("${kafka.group}")
    private String kafkaGroupId;



    @Bean
    public KafkaListenerContainerFactory<?> batchFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SberDataCloudFormattedMessage<?>> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setBatchListener(true);
        return factory;
    }

    @Bean
    public KafkaListenerContainerFactory<?> singleFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SberDataCloudFormattedMessage<?>> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setBatchListener(false);
        return factory;
    }

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaGroupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");
        props.put("ssl.endpoint.identification.algorithm", "");
        props.put("security.protocol", SECURITY_PROTOCOL_VALUE);
        props.put("ssl.truststore.location", TRUST_STORE_LOCATION);
        props.put("ssl.truststore.password", TRUST_STORE_PASSWORD);
        props.put("ssl.key.password", KEY_PASSWORD);
        props.put("ssl.keystore.password", KEY_STORE_PASSWORD);
        props.put("ssl.keystore.location", KEY_STORE_LOCATION);
        return props;
    }

    @Bean
    public ConsumerFactory<String, SberDataCloudFormattedMessage<?>> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(
                this.consumerConfigs(),
                new StringDeserializer(),
                new JsonDeserializer<>(SberDataCloudFormattedMessage.class, false));
    }

    @Bean
    public ObjectMapper mapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper;
    }
}
