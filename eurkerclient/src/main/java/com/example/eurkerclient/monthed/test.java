package com.example.eurkerclient.monthed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {


    @GetMapping("/getTest")
    public String getTest(){
        return "Hello Eureka";
    }
}
