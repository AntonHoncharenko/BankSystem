package com.practice.banksystem.mapper;

import com.practice.banksystem.dto.BankRequestDto;
import com.practice.banksystem.dto.BankResponseDto;
import com.practice.banksystem.entity.BankEntity;

public class BankMapper
{
    public BankEntity bankRequestDtoToBankEntity(BankRequestDto bankRequestDto)
    {
        BankEntity bankEntity = new BankEntity();
        if (bankRequestDto == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        bankEntity.setId(bankRequestDto.getId());
        bankEntity.setName(bankRequestDto.getName());
        bankEntity.setQnt(bankRequestDto.getQnt());
        return bankEntity;
    }

    public BankResponseDto bankEntityToBankResponseDto(BankEntity bankEntity)
    {
        BankResponseDto bankResponseDto = new BankResponseDto();
        if (bankEntity == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        bankResponseDto.setId(bankEntity.getId());
        bankResponseDto.setName(bankEntity.getName());
        bankResponseDto.setQnt(bankEntity.getQnt());
        return bankResponseDto;
    }
}
