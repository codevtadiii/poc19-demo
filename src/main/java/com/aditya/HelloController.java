package com.aditya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "POC19 CI/CD Project Working 2nd time";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Feature Branch";
    }

    @GetMapping("/version")
    public String version() {
        return "v1.0 is the version";
    }
}
