package com.translateIdea2Code.interface_seggregation.problem;

import java.util.List;

public class LoanPayment implements Payment {

    @Override
    public void initiatePayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object paymentStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> getPayments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void initiateLoanSettlement() {
        System.out.println("Initiating loan settlement");
    }

    @Override
    public void initiateRepayment() {
        System.out.println("Initiating repayment");

    }
}
