package com.app.kafka.config;

import com.app.model.CxTxbLogStat;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
//    @Value(value = "${kafka.bootstrapAddress}")
//    private String bootstrapAddress;
//
//    public ConsumerFactory<String, Data> consumerFactory() {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        config.put(ConsumerConfig.GROUP_ID_CONFIG, "consuming");
//
////        DefaultJackson2JavaTypeMapper typeMapper = new DefaultJackson2JavaTypeMapper();
////        Map<String, Class<?>> classMap = new HashMap<>();
////        classMap.put("com.rvs.dto.Data", Data.class);
////        typeMapper.setIdClassMapping(classMap);
////        typeMapper.addTrustedPackages("*");
//
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
////        JsonDeserializer<Data> jsonDeserializer = new JsonDeserializer<>(Data.class);
////        jsonDeserializer.setTypeMapper(typeMapper);
////        jsonDeserializer.setUseTypeMapperForKey(true);
//
//        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(Data.class));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, Data> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, Data> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
    @Value("${kafka.server}")
    private String kafkaServer;

    @Value("${kafka.consumer.id}")
    private String kafkaGroupId;

    @Bean
    public KafkaListenerContainerFactory<?> batchFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CxTxbLogStat> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setBatchListener(true);
//        factory.setMessageConverter(new BatchMessagingMessageConverter(converter()));
        return factory;
    }

    @Bean
    public KafkaListenerContainerFactory<?> singleFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CxTxbLogStat> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setBatchListener(false);
//        factory.setMessageConverter(new StringJsonMessageConverter());
        return factory;
    }

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaGroupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        return props;
    }

    @Bean
    public ConsumerFactory<String, CxTxbLogStat> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(
                this.consumerConfigs(),
                new StringDeserializer(),
                new JsonDeserializer<>(CxTxbLogStat.class));
    }

}
