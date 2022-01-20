package com.idi.idimath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IdimathApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IdimathApplication.class, args);
        System.out.println();
    }

}
