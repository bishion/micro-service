package com.bishion.ms.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Bishion
 * @date 19-1-14 下午6:00
 * @description
 */
@SpringBootApplication
@RestController
@EnableFeignClients
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Resource
    private ProviderService providerService;
    @RequestMapping("/test")
    public UserDTO test(){
        UserDTO userDTO = new UserDTO();
        userDTO.setPassword("456");
        userDTO.setUsername("123");

        return providerService.test(userDTO);
    }

}
