package io.cellulant.Exchange.Rate.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cellulant.Exchange.Rate.dto.UserDetails;
import io.cellulant.Exchange.Rate.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/cellulant/newuser")
    public List <UserDetails> adduser(@RequestBody UserDetails userDetails){

       try {
           return userService.newUser(userDetails);
       }catch (Exception e){
           e.printStackTrace();
       }
        return userService.getUsers();
    }
    @PostMapping("/cellulant/addUsers")
    public List <UserDetails> addUsers(@RequestBody List <UserDetails> userDetails){

        return userService.addUsers(userDetails);
    }
    @GetMapping("/cellulant/getusers/{id}" )
    public List <UserDetails> getUserDetails(@PathVariable int id) {
        try {
            ObjectMapper objectMapper= new ObjectMapper();
            userService.getUsers();
        }catch (Exception e){
            System.out.println( e.getMessage());
        }
        return null;
    }
    @GetMapping("/cellulant/getusers")
    public List<UserDetails> getAllUsers(){
        try {
            userService.getUsers();
        }catch (Exception e){
            System.out.println(e);
        }
        return userService.getUsers();

    }
    @DeleteMapping("cellulant/deleteuser")
    public UserDetails deleteUserbyId(UserDetails userDetails){
        try {
            userService.deleteuser(userDetails);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return userDetails;
    }



}
