package com.translateIdea2Code.interface_seggregation.solution;

import java.util.List;

public class LoanPayment implements Loan {
    @Override
    public void initiateLoanSettlement() {
        System.out.println("Initiate LoanSettlement");
    }

    @Override
    public void initiateRepayment() {
        System.out.println("Initiate Repayment");
    }

    @Override
    public Object status() {
        System.out.println("Status");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        System.out.println("getPayments");
        return List.of();
    }
}
