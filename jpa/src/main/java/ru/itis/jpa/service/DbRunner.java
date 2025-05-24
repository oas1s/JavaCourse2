//package ru.itis.jpa.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Service;
//import ru.itis.jpa.entity.User;
//import ru.itis.jpa.repository.CocktailRepository;
//import ru.itis.jpa.repository.UserRepository;
//
//@Service
//@RequiredArgsConstructor
//public class DbRunner implements ApplicationRunner {
//
//    private final UserRepository userRepository;
//
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        User user = userRepository.findById(1L).get();
//        user.setName("Egor");
//        userRepository.save(user);
//        userRepository.save(User.builder().name("Azat").surname("Some").build());
//        userRepository.delete(user);
//    }
//}
