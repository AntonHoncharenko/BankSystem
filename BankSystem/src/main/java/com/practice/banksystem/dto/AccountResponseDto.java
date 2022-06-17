package com.practice.banksystem.dto;

import com.practice.banksystem.entity.AccountEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class AccountResponseDto
{
    @NotNull
    private int id;

    @NotBlank
    private String name;

    public AccountResponseDto(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public AccountResponseDto()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        AccountResponseDto account = (AccountResponseDto) o;
        return id == account.id && Objects.equals(name, account.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
