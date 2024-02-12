package ru.andrey.springBootApp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${hello}")
    String value;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(value);

        return "hello";
    }
}
