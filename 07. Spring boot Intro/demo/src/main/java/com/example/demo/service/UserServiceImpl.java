package com.example.demo.service;

import com.example.demo.dto.UserInfo;
import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> userList;

    @Override
    public void registerUser(UserRegistrationDto userRegistrationDto) {
        userList.add(new User(userRegistrationDto.getUsername(),userRegistrationDto.getPassword()));
    }

    @Override
    public List<UserInfo> getUsersInfo() {
        return userList.stream().map(it -> UserInfo.builder().username(it.getUsername()).build()).toList();
    }

}
