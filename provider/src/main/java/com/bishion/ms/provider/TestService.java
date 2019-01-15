package com.bishion.ms.provider;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Bishion
 * @date 19-1-15 上午10:33
 * @description
 */
@FeignClient("test")
public interface TestService {
    @RequestMapping("/test")
    UserDTO testUser( UserDTO userDTO);
}
