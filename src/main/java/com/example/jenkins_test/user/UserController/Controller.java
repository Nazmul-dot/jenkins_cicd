package com.example.jenkins_test.user.UserController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping("/jenkins")
    public ResponseEntity<?> getUser() {
        return new ResponseEntity<>("Jenkins2", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<?> getUser2() {
        return new ResponseEntity<>("health check2 testing", HttpStatus.OK);
    }
}
