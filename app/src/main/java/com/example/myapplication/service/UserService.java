package com.example.myapplication.service;

import com.example.myapplication.Model.UserInfo;

public class UserService {
    public boolean login(String username, String password) {
        UserInfo userInfo = getUserInfo();
        return username.equals(userInfo.username) && password.equals(userInfo.password);
    }

    private UserInfo getUserInfo() {
        return new UserInfo("17023105", "password17023105");
    }
}
