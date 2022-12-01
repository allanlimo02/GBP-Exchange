package io.cellulant.Exchange.Rate.controller;

import io.cellulant.Exchange.Rate.dto.UserDetails;
import io.cellulant.Exchange.Rate.repositories.User_repository;
import io.cellulant.Exchange.Rate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/cellulant/newuser")
    public UserDetails adduser(UserDetails userDetails){

        return userService.newUser(userDetails);
    }
    @PostMapping("/cellulant/addUsers")
    public List <UserDetails> addUsers(List <UserDetails> userDetails){

        return userService.addUsers(userDetails);
    }

}
