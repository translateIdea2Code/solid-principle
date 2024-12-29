package com.translateIdea2Code.liskov_substitution.solution;

public class BankingAppWithdrawalService {

    public static void main(String[] args) {

        WithDrawableAccount withDrawableAccount = new CurrentAccount();
        withDrawableAccount.withdraw(500);


    }
}
