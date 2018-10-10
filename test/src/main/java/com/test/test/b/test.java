package com.test.test.b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {


    @GetMapping("/getTest")
    public String getTest(){
        return "Hello Eureka";
    }
}
