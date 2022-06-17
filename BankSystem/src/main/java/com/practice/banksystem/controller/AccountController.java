package com.practice.banksystem.controller;

import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.service.AccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class AccountController
{
    private final AccountServiceImpl accountService = new AccountServiceImpl();

    @PostMapping("/createAccount")
    public void createAccount(@RequestBody AccountRequestDto requestDTO)
    {
        accountService.createAccount(requestDTO);
    }
    @GetMapping("/getAccounts")

    public ArrayList<AccountResponseDto> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }
    @GetMapping("/getAccount")
    public AccountResponseDto getAccountById(int id)
    {
        return accountService.getAccountById(id);
    }
    @DeleteMapping("/deleteAccount")
    public void deleteAccountById(int id)
    {
        accountService.deleteAccountById(id);
    }
}
