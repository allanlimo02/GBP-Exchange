package io.cellulant.Exchange.Rate.service;

import io.cellulant.Exchange.Rate.dto.UserDetails;
import io.cellulant.Exchange.Rate.repositories.User_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private User_repository user_repository;


    //add new User
    public UserDetails newUser(UserDetails userDetails){
        try{
            user_repository.save(userDetails);
        }catch (Exception e){
            System.out.println(e);
        }

        return user_repository.save(userDetails);
    }
    //add multiple new users
    public List <UserDetails> addUsers(List <UserDetails> userDetails){
        try {
            user_repository.saveAll(userDetails);
        }catch (Exception e){
            System.out.println(e);
        }
        return user_repository.findAll();
    }
    //Find All Users
    public List <UserDetails> getUsers(){
        try{
            user_repository.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return user_repository.findAll();
    }
}
