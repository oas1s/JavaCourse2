package com.example.demo.service;

import com.example.demo.dto.UserInfo;
import com.example.demo.dto.UserRegistrationDto;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
@Primary
public class DbUserServiceImpl implements UserService {

    @Autowired
    Connection connection;

    @Override
    @SneakyThrows
    public void registerUser(UserRegistrationDto userRegistrationDto) {
        connection.createStatement().execute(String.format("INSERT INTO my_users VALUES ('%s','%s')",
                userRegistrationDto.getUsername(), userRegistrationDto.getPassword()));
    }

    @Override
    public List<UserInfo> getUsersInfo() {
        return List.of();
    }
}
