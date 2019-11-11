package com.isoftstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CqSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqSpringCloudConfigServerApplication.class, args);
    }

}
