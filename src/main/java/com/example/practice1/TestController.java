package com.example.practice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //hello world 띄우기
    @GetMapping("/v1/test")
    public String helloWorld() {
        return "hello world";
    }
}
