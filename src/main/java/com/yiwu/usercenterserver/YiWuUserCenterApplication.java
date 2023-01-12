package com.yiwu.usercenterserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = {"com.yiwu.usercenterserver.dao"})

public class YiWuUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiWuUserCenterApplication.class, args);
    }

}
