package com.geekster.usermanagementsystem.model;

import org.springframework.context.annotation.EnableMBeanExport;

public class User {
   private String userId;
   private String name;
   private String userName;
   private String phoneNo;
   private String address;

   public User(String userId, String name, String userName, String phoneNo, String address) {
      this.userId = userId;
      this.name = name;
      this.userName = userName;
      this.phoneNo = phoneNo;
      this.address = address;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}
