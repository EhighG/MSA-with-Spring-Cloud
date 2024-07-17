package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "First Service!";
    }
}
