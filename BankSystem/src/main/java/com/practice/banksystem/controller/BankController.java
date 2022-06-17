package com.practice.banksystem.controller;

import com.practice.banksystem.dto.BankRequestDto;
import com.practice.banksystem.dto.BankResponseDto;
import com.practice.banksystem.entity.BankEntity;
import com.practice.banksystem.service.BankServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
@Controller
public class BankController
{
    private final BankServiceImpl bankService = new BankServiceImpl();
    @PostMapping("/createBank")
    public void createBank(BankRequestDto requestDTO)
    {
        bankService.createBank(requestDTO);
    }
    @GetMapping("/getBanks")
    public ArrayList<BankResponseDto> getAllBanks()
    {
        return bankService.getAllBanks();
    }
    @GetMapping("/getBank")
    public BankResponseDto getBankById(int id)
    {
        return bankService.getBankById(id);
    }
    @DeleteMapping("/deleteBank")
    public void deleteBankById(int id)
    {
        bankService.deleteBankById(id);
    }
}