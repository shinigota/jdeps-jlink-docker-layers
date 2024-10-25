package com.benjamin_barbe.hello_world.controller;

import com.benjamin_barbe.hello_world.generated.HelloApiDelegate;
import com.benjamin_barbe.hello_world.service.HelloService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class HelloWorldController implements HelloApiDelegate {
    private final HelloService helloService;

    public HelloWorldController(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public ResponseEntity<String> greetUser(String name) {
        return ResponseEntity.ok(helloService.greetUser(name));
    }
}
