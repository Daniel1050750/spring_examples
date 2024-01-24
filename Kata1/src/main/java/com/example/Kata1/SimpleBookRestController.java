package com.example.Kata1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kata1")
public class SimpleBookRestController {

    @GetMapping(produces = "application/json")
    public String kata1() {
        return "Hello, world!";
    }
}