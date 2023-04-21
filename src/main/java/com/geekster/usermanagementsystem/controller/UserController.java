package com.geekster.usermanagementsystem.controller;

import com.geekster.usermanagementsystem.model.User;
import com.geekster.usermanagementsystem.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
}
    @GetMapping(value = "/getUser/{userId}")
    public User getUserById(@Nullable @PathVariable String userId){
        return userService.getUserById(userId);
    }
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user ){
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId){
        return userService.deleteUserById(userId);
    }
    @PutMapping(value = "/updateUserInfo/{userId}/{name}/{userName}/{phoneNo}/{address}")
    public String updateUserInfo(@PathVariable String userId,@PathVariable String name,@PathVariable String userName,@PathVariable String phoneNo,@PathVariable String address){
         return userService.updateUserInfo(userId,name,userName,phoneNo,address);
    }

}
