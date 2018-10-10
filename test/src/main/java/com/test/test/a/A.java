package com.test.test.a;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test")
public interface A {
    @GetMapping("/getTest")
    String getTest();
}
