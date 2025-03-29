package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
//        its for INSERT UPDATE DELETE etc methods
//        statement.execute()
        List<User> userList = new ArrayList<>();
        while (resultSet.next()){
            Integer id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            Integer finalPoints = resultSet.getInt("final_points");
            userList.add(new User(id,name,surname,finalPoints));
        }

        userList.stream().forEach(System.out::println);
    }


    public static class User{
        private Integer id;
        private String name;
        private String surname;
        private Integer finalPoints;

        public User(Integer id, String name, String surname, Integer finalPoints) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.finalPoints = finalPoints;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", finalPoints=" + finalPoints +
                    '}';
        }
    }
}
