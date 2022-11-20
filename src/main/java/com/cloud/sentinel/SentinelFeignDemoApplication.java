package com.cloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SentinelFeignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignDemoApplication.class, args);
    }

}
