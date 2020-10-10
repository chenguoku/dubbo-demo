package com.hh.springclouddubbosampleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDubboSampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleConsumerApplication.class, args);
    }

}
