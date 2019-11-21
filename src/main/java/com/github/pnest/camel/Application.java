package com.github.pnest.camel;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/camel-application-context.xml",
                "spring/database-application-context.xml"
        );

        log.debug(context.getApplicationName());

        Thread.sleep(TimeUnit.MINUTES.toMillis(5));
    }

}
