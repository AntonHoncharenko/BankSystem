package com.practice.banksystem.repository;

import com.practice.banksystem.dto.BankResponseDto;
import com.practice.banksystem.entity.BankEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface BankRepository
{
    public void add(BankEntity bankEntity);
    public ArrayList<BankEntity> getList();
    public void displayList();
    public BankResponseDto getBankByID(int id);
    public void deleteByID(int id);
}
