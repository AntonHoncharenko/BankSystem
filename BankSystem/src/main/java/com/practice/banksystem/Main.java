package com.practice.banksystem;

import com.practice.banksystem.controller.AccountController;
import com.practice.banksystem.controller.BankController;
import com.practice.banksystem.dto.AccountRequestDto;
import com.practice.banksystem.dto.BankRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);

		BankController bankController = new BankController();
		BankRequestDto bankRequestDto = new BankRequestDto();

		AccountController accountController = new AccountController();
		AccountRequestDto accountRequestDto = new AccountRequestDto();
		Scanner in = new Scanner(System.in);

		System.out.println("=====Banks=====\n");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter id:");
			int id = in.nextInt();
			bankRequestDto.setId(id);
			System.out.println("Enter name:");
			in.nextLine();
			String name = in.nextLine();
			bankRequestDto.setName(name);
			System.out.println("Enter quantity:");
			int qnt = in.nextInt();
			bankRequestDto.setQnt(qnt);
			bankController.createBank(bankRequestDto);
		}
		System.out.println("Bank list:");
		System.out.println(bankController.getAllBanks());
		System.out.println("Enter ID to search:");
		System.out.println(bankController.getBankById(in.nextInt()));
		System.out.println("Enter ID to delete:");
		bankController.deleteBankById(in.nextInt());
		System.out.println(bankController.getAllBanks());

		System.out.println("\n=====Accounts=====\n");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter id:");
			int id = in.nextInt();
			accountRequestDto.setId(id);
			System.out.println("Enter name:");
			in.nextLine();
			String name = in.nextLine();
			accountRequestDto.setName(name);
			accountController.createAccount(accountRequestDto);
		}
		System.out.println("Account list:");
		System.out.println(accountController.getAllAccounts());
		System.out.println("Enter ID to search:");
		System.out.println(accountController.getAccountById(in.nextInt()));
		System.out.println("Enter ID to delete:");
		accountController.deleteAccountById(in.nextInt());
		System.out.println(accountController.getAllAccounts());


	}
}
