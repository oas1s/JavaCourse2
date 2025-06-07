package ru.itis.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.demo.entity.User;
import ru.itis.demo.repository.UserRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsersController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public String getUsers(Pageable pageable,ModelMap map){
        Page<User> userPage = userRepository.findAll(pageable);
        List<User> userList = userPage.getContent();
        map.addAttribute("users",userList);
        return "users";
    }

}
