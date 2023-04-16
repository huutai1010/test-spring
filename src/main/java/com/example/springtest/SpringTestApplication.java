package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestApplication {

    @GetMapping("/message")
    public String message() {
        return "Hello Tai Smile!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

}
