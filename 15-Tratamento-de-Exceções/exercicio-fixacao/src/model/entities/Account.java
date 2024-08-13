package model.entities;

import model.exception.ArgumentException;
import model.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;

    public Account() {
    }

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (Double amount) {
        balance += amount;
    }
    public void withdraw (Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw (Double amount) throws DomainException, ArgumentException {
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new ArgumentException("Not enough balance");
        }

    }
}
