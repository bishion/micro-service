package com.bishion.ms.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author Bishion
 * @date 19-1-15 上午10:32
 * @description
 */
@SpringBootApplication
@EnableFeignClients
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

}
