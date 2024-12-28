package com.translateIdea2Code.liskov_substitution.solution;

public class FixedDepositAccount implements Account{

    @Override
    public boolean deposit(double amount) {
        System.out.println("Fixed  Deposit method called");
        return true;
    }
}
