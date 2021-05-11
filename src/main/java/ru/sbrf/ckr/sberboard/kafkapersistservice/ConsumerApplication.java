package ru.sbrf.ckr.sberboard.kafkapersistservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.sbrf.ckr.sberboard.kafkapersistservice.kafka.MessageListener;

@EnableKafka
@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
    }

}
