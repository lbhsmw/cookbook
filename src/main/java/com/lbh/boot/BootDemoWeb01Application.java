package com.lbh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootDemoWeb01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext c= SpringApplication.run(BootDemoWeb01Application.class, args);
    }

}
