package com.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.dog"})
public class DogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogApplication.class, args);
    }
}
