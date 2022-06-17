package com.practice.banksystem.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class AccountRequestDto
{

    @NotNull
    private int id;

    @NotBlank
    private String name;

    public AccountRequestDto(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public AccountRequestDto()
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
        AccountRequestDto account = (AccountRequestDto) o;
        return id == account.id && Objects.equals(name, account.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }
}
