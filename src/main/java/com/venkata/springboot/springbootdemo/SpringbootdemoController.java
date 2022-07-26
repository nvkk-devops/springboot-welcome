package com.venkata.springboot.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootdemoController {

    @RequestMapping
    public String helloWorld(){
        return "hello world from springboot demo";
    }
}
