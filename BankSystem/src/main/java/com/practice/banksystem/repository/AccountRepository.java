package com.practice.banksystem.repository;

import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.entity.AccountEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface AccountRepository
{
    public void add(AccountEntity accountEntityEntity);
    public ArrayList<AccountEntity> getList();
    public void displayList();
    public AccountResponseDto getAccountByID(int id);
    public void deleteByID(int id);
}
