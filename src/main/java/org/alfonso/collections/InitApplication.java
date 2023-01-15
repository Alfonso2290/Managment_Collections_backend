package org.alfonso.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class InitApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitApplication.class, args);
    }

}
