package com.example.demo.controllers;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name) {
        return helloService.waveByName(name);
    }

}
