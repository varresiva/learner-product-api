package com.learner.LearnerProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnerProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnerProductApiApplication.class, args);
    }

}
