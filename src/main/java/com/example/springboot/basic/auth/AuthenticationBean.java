package com.example.springboot.basic.auth;

public class AuthenticationBean {

    private String message;


    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    
    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            "}";
    }


}