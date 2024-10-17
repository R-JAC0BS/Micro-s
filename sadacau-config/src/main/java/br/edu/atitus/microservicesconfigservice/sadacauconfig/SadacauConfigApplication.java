package br.edu.atitus.microservicesconfigservice.sadacauconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SadacauConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SadacauConfigApplication.class, args);
    }

}
