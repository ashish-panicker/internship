package com.demo.web.service;

import com.demo.web.model.User;

public class UserService {
    public boolean isValidLogin(String userName, String password) {
        User user = new User();
        return (user.getUserName().equals(userName) && user.getPassword().equals(password));
    }
}
