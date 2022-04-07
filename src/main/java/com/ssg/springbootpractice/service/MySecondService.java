package com.ssg.springbootpractice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component
@Service
public class MySecondService implements MyService {

    @Override
    public String hello(){
        return "쓱닷컴 여러분 안녕하세요!";
    }
}
