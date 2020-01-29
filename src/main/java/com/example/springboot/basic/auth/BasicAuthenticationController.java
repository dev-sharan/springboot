package com.example.springboot.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins = "*")
@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean() {
        // throw new RuntimeException("some Error has happeed contact support");
        return new AuthenticationBean("You are authenticated");
    }

}