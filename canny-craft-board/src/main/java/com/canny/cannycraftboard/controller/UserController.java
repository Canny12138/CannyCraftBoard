package com.canny.cannycraftboard.controller;

import com.canny.cannycraftboard.entity.User;
import com.canny.cannycraftboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestParam String username, @RequestParam String password){
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        String status = userService.login(username, password);
        if(!status.equals("noUser") && !status.equals("fail")) {
            return ResponseEntity.status(HttpStatus.OK).body("登录成功" + status);
        }
        else
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(status);
    }
}