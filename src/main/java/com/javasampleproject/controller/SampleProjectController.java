package com.javasampleproject.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleProjectController {


    @GetMapping("/status")
    public ResponseEntity<String> getStaus(){
        return ResponseEntity.ok("Working fine !!");
    }

}
