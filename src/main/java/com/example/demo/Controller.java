package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class Controller {
    @GetMapping
    public ResponseEntity getGreetings(){
       return ResponseEntity.ok().body("Hello There");
    }
}
