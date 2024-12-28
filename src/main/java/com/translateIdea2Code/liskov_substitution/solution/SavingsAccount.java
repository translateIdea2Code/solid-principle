package com.translateIdea2Code.liskov_substitution.solution;

public class SavingsAccount implements WithDrawableAccount{

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Savings account Withdrawing " + amount);
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Savings account Deposit " + amount);
        return true;
    }
}
