package ru.itis.jpa.controller;


import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.jpa.dto.CreateUserDto;
import ru.itis.jpa.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public String registerUser(CreateUserDto createUserDto){
        userService.createUser(createUserDto);
        return "redirect:/login";
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "register";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(CreateUserDto createUserDto, HttpSession httpSession){
        httpSession.setAttribute("name",createUserDto.getName());
        return "redirect:/";
    }
}
