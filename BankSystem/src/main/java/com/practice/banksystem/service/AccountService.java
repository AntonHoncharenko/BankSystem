package com.practice.banksystem.service;

import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.AccountResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface AccountService
{
    public void createAccount(AccountRequestDto requestDTO);
    public ArrayList<AccountResponseDto> getAllAccounts();
    public AccountResponseDto getAccountById(int id);
    public void deleteAccountById(int id);
}
