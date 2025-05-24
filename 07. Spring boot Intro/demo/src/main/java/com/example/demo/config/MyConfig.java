package com.example.demo.config;

import com.example.demo.entity.User;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig {

    @Bean
    public List<User> getUsers() {
        return new ArrayList<>();
    }

    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","postgres");
    }
}
