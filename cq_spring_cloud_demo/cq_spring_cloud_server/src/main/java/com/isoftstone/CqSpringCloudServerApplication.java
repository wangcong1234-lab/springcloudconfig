package com.isoftstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class CqSpringCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqSpringCloudServerApplication.class, args);
    }

}
