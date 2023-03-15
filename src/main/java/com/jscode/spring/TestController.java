package com.jscode.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("name")
    public String test(){
        return "송민혁";
    }
}
