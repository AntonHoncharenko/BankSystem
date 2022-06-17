package com.practice.banksystem.mapper;

import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.entity.AccountEntity;

public class AccountMapper
{
    public AccountEntity accountRequestDtoToAccountEntity(AccountRequestDto accountRequestDto)
    {
        AccountEntity accountEntity = new AccountEntity();
        if (accountRequestDto == null)
        {
            throw new RuntimeException("AccountEntity is null");
        }
        accountEntity.setId(accountRequestDto.getId());
        accountEntity.setName(accountRequestDto.getName());
        return accountEntity;
    }

    public AccountResponseDto accountEntityToAccountResponseDto(AccountEntity accountEntity)
    {
        AccountResponseDto accountResponseDto = new AccountResponseDto();
        if (accountEntity == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        accountResponseDto.setId(accountEntity.getId());
        accountResponseDto.setName(accountEntity.getName());
        return accountResponseDto;
    }
}
