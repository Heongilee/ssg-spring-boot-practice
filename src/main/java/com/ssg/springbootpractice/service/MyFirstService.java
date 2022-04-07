package com.ssg.springbootpractice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MyFirstService implements MyService {

    @Override
    public String hello(){
        return "Hello, world!";
    }
}
