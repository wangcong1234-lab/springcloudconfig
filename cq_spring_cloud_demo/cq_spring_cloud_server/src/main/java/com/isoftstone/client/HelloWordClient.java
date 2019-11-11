package com.isoftstone.client;

import com.isoftstone.error.HystricService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE-HI",fallback = HystricService.class)
public interface HelloWordClient {

    @GetMapping("/hello/hi.do")
    String hi();
}
