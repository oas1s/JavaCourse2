package ru.itis.jpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.jpa.dto.CreateUserDto;
import ru.itis.jpa.entity.User;
import ru.itis.jpa.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(CreateUserDto createUserDto) {
        userRepository.save(User.builder().name(createUserDto.getName())
                .surname(createUserDto.getSurname()).build());
    }
}
