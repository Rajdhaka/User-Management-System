package com.geekster.usermanagementsystem.service;

import com.geekster.usermanagementsystem.model.User;
import com.geekster.usermanagementsystem.repository.UserDao;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUser(){
        return userDao.getAll();
    }

    public  User getUserById(String userId){
        if(userId != null){
            List<User>allUserList=userDao.getAll();
            for(User user:allUserList){
                if(user.getUserId().equals(userId)){
                    return user;
                }
            }
        }
        return null;
    }

    public String addUser(User user){
       boolean addUserToList = userDao.add(user);
       if(addUserToList){
           return "user is added !!!";
       }
       else{
           return "user is not added !!!";
       }
    }
    String status;
    public String deleteUserById(String userId){
        if(userId != null){
            List<User>allUserList=userDao.getAll();
            for(User user:allUserList){
                if(user.getUserId().equals(userId)){
                    boolean deleterUser = userDao.remove(user);
                    if(deleterUser) {
                        status="user with id "+ userId +" is deleted !!!";
                    }
                    else {
                        status="user with id "+ userId +" is not deleted !!!";
                    }
                    return status;
                }
                return "user is not found .... Database Error";

            }
        }
        return "failed user can't be remove";
    }

    public String updateUserInfo(String userId,String name, String userName,String phoneNo, String address) {
        boolean updateUserInfo= userDao.updateUser(userId,name,userName,phoneNo,address);
        if(updateUserInfo) {
            return "user with id " + userId + " was updated !!!";
        }
        else {
            return "user with id " + userId + " does not exist !!!";
        }
    }
}


