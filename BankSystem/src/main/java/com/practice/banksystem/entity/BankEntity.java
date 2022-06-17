package com.practice.banksystem.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BankEntity
{
    @NotNull
    private int id;
    @NotBlank
    private String name;
    @NotNull
    private int qnt;

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
        BankEntity that = (BankEntity) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "BankEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qnt=" + qnt +
                '}';
    }
}
