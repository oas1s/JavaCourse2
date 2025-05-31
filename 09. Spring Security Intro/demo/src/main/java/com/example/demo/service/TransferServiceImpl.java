package com.example.demo.service;

import com.example.demo.dto.TransferDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferServiceImpl {

    private final UsersRepository usersRepository;

    @Transactional
    public void transfer(TransferDto transferDto) {
        User from = usersRepository.findOneByEmail(transferDto.getFrom()).get();
        User to = usersRepository.findOneByEmail(transferDto.getTo()).get();
        from.setMoney(from.getMoney()-transferDto.getAmount());
        usersRepository.save(from);
        to.setMoney(to.getMoney()+transferDto.getAmount());
        some();
        usersRepository.save(to);
    }


    public void some(){
        throw new RuntimeException("sd");
    }
}
