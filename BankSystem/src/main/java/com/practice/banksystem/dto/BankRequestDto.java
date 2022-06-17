package com.practice.banksystem.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BankRequestDto
{
    @NotNull
    int id;
    @NotBlank
    String name;
    @NotNull
    int qnt;

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    public int getQnt() {
        return qnt;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, qnt);
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
        BankRequestDto that = (BankRequestDto) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }
}
