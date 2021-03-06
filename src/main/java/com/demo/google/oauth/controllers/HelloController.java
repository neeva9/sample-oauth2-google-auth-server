package com.demo.google.oauth.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model, @RequestParam(defaultValue = "XYZ", required = false) String name) {
        model.addAttribute("name", name);
        return "Hello " + name;
    }
}