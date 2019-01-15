package com.bishion.ms.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Bishion
 * @date 19-1-15 上午10:36
 * @description
 */
@RestController
public class TestServiceImpl implements TestService{
    @Autowired
    private HttpServletRequest httpServletRequest;

    public UserDTO testUser(UserDTO userDTO) {
        return userDTO;
    }
}
