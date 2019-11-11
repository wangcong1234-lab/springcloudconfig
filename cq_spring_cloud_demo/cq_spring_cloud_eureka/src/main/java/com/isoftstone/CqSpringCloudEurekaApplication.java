package com.isoftstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CqSpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqSpringCloudEurekaApplication.class, args);
    }

}
