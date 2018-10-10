package com.example.eurkerclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLIENTONE")

public interface TestClient {

    @GetMapping("/getTest")
    String getTest();
}
