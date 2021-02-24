package ru.sbrf.ckr.sberboard.kafkapersistservice;

import ru.sbrf.ckr.sberboard.kafkapersistservice.kafka.MessageListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

//    @Bean
//    public JsonDeserializer jsonDeserializer() {
//        return new JsonDeserializer() {
//            @Override
//            public Object deserialize(JsonParser p, DeserializationContext context) throws IOException {
//                return null;
//            }
//        };
//    }


    @Bean
    public MessageListener messageListener() {
        return new MessageListener();
    }
}
