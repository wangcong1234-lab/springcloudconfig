package com.isoftstone.controller;

import com.isoftstone.client.HelloWordClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldServerController {

    @Autowired
    private HelloWordClient helloWordClient;

    @GetMapping("sayHi.do")
    public String sayHi(){
        return helloWordClient.hi()+"你好啊!!!";
    }

}
