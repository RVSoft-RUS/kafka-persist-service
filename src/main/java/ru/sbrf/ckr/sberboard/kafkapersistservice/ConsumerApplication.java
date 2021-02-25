package ru.sbrf.ckr.sberboard.kafkapersistservice;

import org.springframework.context.ApplicationContext;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafka.MessageListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);

    }

    @Bean
    public MessageListener messageListener() {
        return new MessageListener();
    }
}
