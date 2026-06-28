package com.aditya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "erripuka chadukondi firstuu ";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Niku Hello entra Dengey !!";
    }
}
