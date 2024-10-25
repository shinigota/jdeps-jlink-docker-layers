package com.benjamin_barbe.hello_world.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greetUser(String name) {
        return "Hello s %s !".formatted(name);
    }
}
