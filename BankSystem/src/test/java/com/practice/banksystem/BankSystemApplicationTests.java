package com.practice.banksystem;

import com.practice.banksystem.controller.AccountController;
import com.practice.banksystem.controller.BankController;
import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.AccountResponseDto;
import com.practice.banksystem.dto.BankRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BankSystemApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void TestAccountControllerAdd()
    {
        AccountController controller = new AccountController();
        AccountRequestDto requestDto = new AccountRequestDto(1, "John");
        controller.createAccount(requestDto);
        AccountResponseDto responseDto = controller.getAccountById(1);
        String response = responseDto.getName();
        assertEquals("John", response);
    }

}
