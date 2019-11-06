package com.github.pnest.camel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring/camel-application-context.xml");
        System.out.println(context.getApplicationName());
    }

}
