package com.fideljose.SpringBootGenerateTools.orm.controllers;

import com.fideljose.SpringBootGenerateTools.models.User;
import com.fideljose.SpringBootGenerateTools.orm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        User u = userService.save(User.builder().id(null).userName("fidel"+id).build());
        Optional<User> us = userService.findById(u.getId());
        if(us.isPresent()){
            return userService.findById(id).get();
        }else{
            return User.builder().id(1).userName("vacio").build();
        }

    }

}
