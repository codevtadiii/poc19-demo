package com.aditya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome My friend -demo check! ";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello my Friend!";
    }

    @GetMapping("/version")
    public String version() {
        return "v1.0 is the version";
    }
}
