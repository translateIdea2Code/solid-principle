package com.translateIdea2Code.liskov_substitution.solution;

public class CurrentAccount implements WithDrawableAccount{

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Current account is withdrawn with " + amount);
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Current account is deposited with " + amount);
        return true;
    }
}
