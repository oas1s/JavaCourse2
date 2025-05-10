package com.example.demo.service;

import com.example.demo.dto.UserInfo;
import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    void registerUser(UserRegistrationDto userRegistrationDto);

    List<UserInfo> getUsersInfo();
}
