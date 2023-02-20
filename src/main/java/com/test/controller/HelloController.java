package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.function.Consumer;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World");
        return "Hello World!";
    }

    @GetMapping("testDate/{date}")
    public Date processApi(@PathVariable Date date) {
        return date;
    }
}
