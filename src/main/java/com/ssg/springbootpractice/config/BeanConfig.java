package com.ssg.springbootpractice.config;

import com.ssg.springbootpractice.service.MySecondService;
import com.ssg.springbootpractice.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스는 "설정파일"이다. 라고 알려줌
public class BeanConfig {

    @Bean
    public MyService myService() {
        return new MySecondService();
    }
}
