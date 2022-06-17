package com.practice.banksystem.service;

import com.practice.banksystem.dto.BankRequestDto;
import com.practice.banksystem.dto.BankResponseDto;
import com.practice.banksystem.entity.BankEntity;
import com.practice.banksystem.mapper.BankMapper;
import com.practice.banksystem.repository.BankRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankServiceImpl implements BankService
{
    private final BankRepositoryImpl bankRepository = new BankRepositoryImpl();
    private final BankMapper mapper = new BankMapper();

    @Override
    public void createBank(BankRequestDto requestDTO)
    {
        ArrayList<BankEntity> BankEntityCheckList = bankRepository.getList();
        for(BankEntity entity: BankEntityCheckList)
        {
            if(entity.getId() == requestDTO.getId())
                try
                {
                    throw new Exception("Item is existing");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        BankMapper mapper = new BankMapper();
        bankRepository.add(mapper.bankRequestDtoToBankEntity(requestDTO));
    }

    @Override
    public ArrayList<BankResponseDto> getAllBanks()
    {
        ArrayList<BankResponseDto> bankResponseDtoList = new ArrayList<>();
        ArrayList<BankEntity> BankEntityList = bankRepository.getList();
        for (BankEntity entity:BankEntityList)
        {
            BankResponseDto response = mapper.bankEntityToBankResponseDto(entity);
            bankResponseDtoList.add(response);
        }
        return bankResponseDtoList;
    }

    @Override
    public BankResponseDto getBankById(int id)
    {
        return bankRepository.getBankByID(id);
    }

    @Override
    public void deleteBankById(int id)
    {
        bankRepository.deleteByID(id);
    }
}
