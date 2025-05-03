package ru.itis;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbContainer {


    private static Connection connection;


    public static Connection getConnection(){
        try {
            if (connection == null){
                connection = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
                return connection;
            } else {
                return connection;
            }
        } catch (Exception e ){
        }
        return null;
    }
}
