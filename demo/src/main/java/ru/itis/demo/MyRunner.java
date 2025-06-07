package ru.itis.demo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.itis.demo.entity.User;
import ru.itis.demo.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyRunner implements CommandLineRunner {

    private final UserRepository userRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<User> userList = userRepository.findAll();

        userList.forEach( u -> {
            u.getPets().forEach(p -> {
                System.out.println("user with name " + u.getFirstName() +
                        "owns pet with name " + p.getName());
            });
        });
    }
}
