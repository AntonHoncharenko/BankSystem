package com.practice.banksystem.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class AccountEntity {
    @NotNull
    private int id;
    @NotBlank
    private String name;

    public AccountEntity(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public AccountEntity()
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
        AccountEntity account = (AccountEntity) o;
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

