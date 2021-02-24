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

//        CxTxbLogStatRepository repo = context.getBean(CxTxbLogStatRepository.class);
//
//        CxTxbLogStat stat = new CxTxbLogStat();
//        stat.setRow_id("qw");
//        stat.setAction_id("qw1");
//        repo.insert(stat);
    }

    @Bean
    public MessageListener messageListener() {
        return new MessageListener();
    }
}
