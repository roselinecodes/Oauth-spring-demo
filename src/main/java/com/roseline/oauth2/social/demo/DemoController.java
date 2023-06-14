package com.roseline.oauth2.social.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping("/api/v1/demo/welcome")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from secure endpoint");
    }
}
