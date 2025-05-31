package com.example.demo.controller;

import com.example.demo.dto.TransferDto;
import com.example.demo.service.TransferServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MoneyTransferController {

    private final TransferServiceImpl transferService;


    @GetMapping("/transfer")
    public String getTransferPage(){
        return "transfer";
    }

    @PostMapping("/transfer")
    public String transfer(TransferDto transferDto){
        transferService.transfer(transferDto);
        return "Success";
    }
}
