package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String waveByName(String name) {
        return "Hello %s".formatted(name);
    }

}
