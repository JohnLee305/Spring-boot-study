package io.jh.rest.controller;

import io.jh.rest.entity.User;
import io.jh.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //사용자 신규 등록
    @PostMapping("/users")
    public String register( @RequestBody User newUser){
         return userService.register(newUser);
    }

    @GetMapping("/users/{id}")
    public User find (@PathVariable String id){
        return userService.find(id);
    }

    @PutMapping("/users")
    public void modify(@RequestBody User newUser){
        userService.modify(newUser);
    }

    @DeleteMapping("/users/{id}")
    public void remove(@PathVariable String id){
        userService.remove(id);
    }

}
