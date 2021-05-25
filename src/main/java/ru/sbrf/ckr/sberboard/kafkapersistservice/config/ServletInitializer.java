package ru.sbrf.ckr.sberboard.kafkapersistservice.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import ru.sbrf.ckr.sberboard.kafkapersistservice.ConsumerApplication;

@Configuration
public class ServletInitializer extends SpringBootServletInitializer {

    private static Class<ConsumerApplication> applicationClass = ConsumerApplication.class;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}
