package com.practice.banksystem.service;

import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.entity.AccountEntity;
import com.practice.banksystem.mapper.AccountMapper;
import com.practice.banksystem.repository.AccountRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountServiceImpl implements AccountService
{
    private final AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
    private final AccountMapper mapper = new AccountMapper();

    @Override
    public void createAccount(AccountRequestDto requestDTO)
    {
        ArrayList<AccountEntity> AccountEntityCheckList = accountRepository.getList();
        for(AccountEntity entity: AccountEntityCheckList)
        {
            if(entity.getId() == requestDTO.getId())
                try
                {
                    throw new Exception("Item is existing");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        AccountMapper mapper = new AccountMapper();
        accountRepository.add(mapper.accountRequestDtoToAccountEntity(requestDTO));
    }

    @Override
    public ArrayList<AccountResponseDto> getAllAccounts()
    {
        ArrayList<AccountResponseDto> accountResponseDtoList = new ArrayList<>();
        ArrayList<AccountEntity> BankEntityList = accountRepository.getList();
        for (AccountEntity entity:BankEntityList)
        {
            AccountResponseDto response = mapper.accountEntityToAccountResponseDto(entity);
            accountResponseDtoList.add(response);
        }
        return accountResponseDtoList;
    }

    @Override
    public AccountResponseDto getAccountById(int id)
    {
        return accountRepository.getAccountByID(id);
    }

    @Override
    public void deleteAccountById(int id)
    {
        accountRepository.deleteByID(id);
    }
}
