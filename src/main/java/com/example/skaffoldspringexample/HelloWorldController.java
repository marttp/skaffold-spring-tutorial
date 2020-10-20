package com.example.skaffoldspringexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<ResponseTemplate<String>> hello() {
        return new ResponseEntity<>(new ResponseTemplate<>("success", "hello world"), HttpStatus.OK);
    }
}