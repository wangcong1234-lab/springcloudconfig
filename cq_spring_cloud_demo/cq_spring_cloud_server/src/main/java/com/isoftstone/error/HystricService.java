package com.isoftstone.error;

import com.isoftstone.client.HelloWordClient;
import org.springframework.stereotype.Component;

@Component
public class HystricService implements HelloWordClient {

    @Override
    public String hi() {
        return "服务器忙，请重试";
    }
}
