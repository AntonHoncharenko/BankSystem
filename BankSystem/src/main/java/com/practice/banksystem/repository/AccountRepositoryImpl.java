package com.practice.banksystem.repository;

import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.entity.AccountEntity;
import com.practice.banksystem.mapper.AccountMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AccountRepositoryImpl implements AccountRepository
{
    private final ArrayList<AccountEntity> accountEntityList = new ArrayList<>();

    @Override
    public void add(AccountEntity  bankEntity)
    {
        accountEntityList.add(bankEntity);
    }

    @Override
    public ArrayList<AccountEntity> getList()
    {
        return accountEntityList;
    }

    @Override
    public void displayList()
    {
        System.out.println(accountEntityList.get(0));
    }

    @Override
    public AccountResponseDto getAccountByID(int id)
    {
        for(AccountEntity entity: accountEntityList)
        {
            if(entity.getId() == id)
            {
                AccountMapper mapper = new AccountMapper();
                return mapper.accountEntityToAccountResponseDto(entity);
            }

        }
        return null;
    }
    @Override
    public void deleteByID(int id)
    {
        accountEntityList.removeIf(entity -> entity.getId() == id);
    }
}
