package com.bestrookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bestrookie
 * @date 2021/8/19 1:43 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientApplication.class,args);
    }
}
