package com.huseyinaydin;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        this.balance = this.getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        if(this.balance >= amount)
            this.balance = this.getBalance() - amount;
        else
            throw new BalanceInsufficentException("Bakiye yetersiz");
    }

    public double getBalance() {
        return balance;
    }
}
