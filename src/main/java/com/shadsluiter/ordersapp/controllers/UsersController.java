package com.shadsluiter.ordersapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
import com.shadsluiter.ordersapp.models.UserModel;
import com.shadsluiter.ordersapp.service.UserService;  


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsersController {

    @Autowired
    private UserService userService; 

    // no authentication manager yet

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserModel user) {
        if (userService.findByLoginName(user.getLoginName()) != null) {
            return ResponseEntity.badRequest().body("User already exists!");
        }
        return ResponseEntity.ok(userService.save(user));
    }
    

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody UserModel loginRequest) {
        UserModel user = userService.findByLoginName(loginRequest.getLoginName());
        if (user == null) {
            return ResponseEntity.badRequest().body("User not found!");
        }
        return ResponseEntity.ok(user);
    }
}

