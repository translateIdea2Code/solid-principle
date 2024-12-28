package com.translateIdea2Code.liskov_substitution.solution;

public class LiskovWithDrawService {

    public static void main(String[] args) {

        WithDrawableAccount account = new CurrentAccount();
        account.deposit(500);
        account.withdraw(500);

        WithDrawableAccount account2 = new SavingsAccount();
        account2.deposit(500);
        account2.withdraw(500);

        Account account3 = new FixedDepositAccount();
        account3.deposit(500);
    }
}
