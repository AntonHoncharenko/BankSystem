package com.practice.banksystem.service;

import com.practice.banksystem.dto.BankRequestDto;
import com.practice.banksystem.dto.BankResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface BankService
{
    public void createBank(BankRequestDto requestDTO);
    public ArrayList<BankResponseDto> getAllBanks();
    public BankResponseDto getBankById(int id);
    public void deleteBankById(int id);
}
