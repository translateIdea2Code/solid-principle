package com.translateIdea2Code.liskov_substitution.problem;

/**
 * Open Closed Principle is Used very nicely here
 */
public class CurrentAccount implements Account{

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Current account withdrawal: " + amount  );
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Current account deposit: " + amount );
        return true;
    }
}
