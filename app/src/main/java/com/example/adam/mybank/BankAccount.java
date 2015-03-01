package com.example.adam.mybank;

/**
 * Created by Adam on 2/26/2015.
 */
public class BankAccount {
    private double balance;

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;


    }

    public double getBalance(){
        return balance;
    }
}
