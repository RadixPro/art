package com.kampherbeek.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kampherbeek.art")
public class ArtCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtCoreApplication.class, args);
    }
}

