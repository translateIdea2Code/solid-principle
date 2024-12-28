package com.translateIdea2Code.liskov_substitution.problem;

public class FixedDepositAccount implements Account{

    /**
     * Problem is here you cannot withdraw amount from FixedDeposit in Freeze or lock period
     * Open Closed Principle says class is open for Extension & closed for modification
     * <p>
     * User of this Class has unexpected result because he knows class is adhering to Open Closed
     */
    @Override
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported by FixedDepositAccount.");

    }

    @Override
    public boolean deposit(double amount) {
        System.out.println("Fixed Deposit Account amount: " + amount);
        return true;
    }
}
