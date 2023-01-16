package org.alfonso.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //Habilita la capacidad de ejecución de tareas programadas de Spring
@SpringBootApplication //Define que es una aplicacion con spring boot
public class InitApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitApplication.class, args);
    }

}
