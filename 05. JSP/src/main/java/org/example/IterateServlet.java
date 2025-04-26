package org.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/iterate")
public class IterateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("myList", List.of(new User("Azat","Faskhutdinov"), new User("Vasya","Petrov")));
        req.getRequestDispatcher("/iterate.jsp").forward(req,resp);
    }



    public static class User{
        public String name;
        public String surname;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
    }
}
