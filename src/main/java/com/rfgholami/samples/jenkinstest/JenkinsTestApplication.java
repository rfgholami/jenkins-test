package com.rfgholami.samples.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
@RestController
@RequestMapping(value = "/")
class HelloController {

    @GetMapping(value = "hello")
    public String sayHello() {
        return "Hello";
    }

}

