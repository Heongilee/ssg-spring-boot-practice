package com.ssg.springbootpractice.controller;

import com.ssg.springbootpractice.service.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @ResponseBody // 이 이름의 뷰를 찾지않고 데이터로써 출력한다.
    @GetMapping("/")
    public String main() {
        return myService.hello();
    }
}
