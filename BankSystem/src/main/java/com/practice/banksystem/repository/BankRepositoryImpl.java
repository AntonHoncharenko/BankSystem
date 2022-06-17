package com.practice.banksystem.repository;

import com.practice.banksystem.dto.BankResponseDto;
import com.practice.banksystem.entity.BankEntity;
import com.practice.banksystem.mapper.BankMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BankRepositoryImpl implements BankRepository
{
    private final ArrayList<BankEntity> bankEntityList = new ArrayList<>();

    @Override
    public void add(BankEntity  bankEntity)
    {
        bankEntityList.add(bankEntity);
    }

    @Override
    public ArrayList<BankEntity> getList()
    {
        return bankEntityList;
    }

    @Override
    public void displayList()
    {
        System.out.println(bankEntityList.get(0));
    }

    @Override
    public BankResponseDto getBankByID(int id)
    {
        for(BankEntity entity: bankEntityList)
        {
            if(entity.getId() == id)
            {
                BankMapper mapper = new BankMapper();
                return mapper.bankEntityToBankResponseDto(entity);
            }

        }
        return null;
    }
    @Override
    public void deleteByID(int id)
    {
        bankEntityList.removeIf(entity -> entity.getId() == id);
    }
}
