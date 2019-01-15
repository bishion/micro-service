package com.bishion.ms.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Bishion
 * @date 19-1-15 上午10:41
 * @description
 */
@FeignClient(value = "providerService",url = "http://localhost:8081")
public interface ProviderService {
    @RequestMapping("/test")
    UserDTO test(UserDTO userDTO);
}
