package com.geekster.usermanagementsystem.repository;

import com.geekster.usermanagementsystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    private List<User>userList;

  public UserDao(){
      userList= new ArrayList<>();
      userList.add(new User("0","user","user1","9587******","India"));
    }
    public List<User> getAll(){
      return userList;
    }
    public boolean add(User user){
      userList.add(user);
      return true;
    }
    public boolean remove(User user){
      userList.remove(user);
      return true;
    }

    public boolean updateUser(String userId,String name, String userName,String phoneNo, String address) {
      for (User user : userList) {
        if (user.getUserId().equals(userId)) {
          userList.remove(user);
          user.setName(name);
          user.setUserName(userName);
          user.setPhoneNo(phoneNo);
          user.setAddress(address);
          userList.add(user);
          return true;
        }
      }
      return false;
    }
}
