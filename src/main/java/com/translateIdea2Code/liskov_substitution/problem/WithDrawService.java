package com.translateIdea2Code.liskov_substitution.problem;

public class WithDrawService {

    /**
     * Open Closed limitation
     *</p>
     * Depositing 500.0 from savings account
     * Withdrawing 500.0 from savings account
     * Current account deposit: 500.0
     * Current account withdrawal: 500.0
     * Fixed Deposit Account amount: 500.0
     * Exception in thread "main" java.lang.UnsupportedOperationException: Not supported by FixedDepositAccount.
     * 	at com.translateIdea2Code.liskov_substitution.problem.FixedDepositAccount.withdraw(FixedDepositAccount.java:13)
     * 	at com.translateIdea2Code.liskov_substitution.problem.WithDrawService.main(WithDrawService.java:18)
     * 	</p>
     * 	What Went Wrong?
     * The BankingAppWithdrawalService is a client of the Account class. It expects that both Account and its subtypes guarantee the behavior that the Account class has specified for its withdraw method:
     *
     *
     */


    public static void main(String[] args) {
        Account account = new SavingsAccount();
        account.deposit(500);
        account.withdraw(500);

        Account account2 = new CurrentAccount();
        account2.deposit(500);
        account2.withdraw(500);

        Account account3 = new FixedDepositAccount();
        account3.deposit(500);
        account3.withdraw(500);

    }
}
