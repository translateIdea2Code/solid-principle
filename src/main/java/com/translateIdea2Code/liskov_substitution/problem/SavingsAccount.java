package com.translateIdea2Code.liskov_substitution.problem;
/**
 * Open Closed Principle is Used very nicely here
 */
public class SavingsAccount implements Account {

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from savings account");
        return true;

    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Depositing " + amount + " from savings account");
        return true;
    }
}
