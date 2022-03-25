package io.jh.rest.controller;

import io.jh.rest.entity.User;
import io.jh.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //사용자 신규 등록
    @PostMapping("/users")
    public String register( @RequestBody User newUser){
         return userService.register(newUser);
    }

    @GetMapping("/users/id")
    public User find (Stri ng id){
        return userService.find(id);
    }

}
