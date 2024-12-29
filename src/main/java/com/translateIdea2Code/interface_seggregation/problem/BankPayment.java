package com.translateIdea2Code.interface_seggregation.problem;

import java.util.List;

public class BankPayment implements Payment {
    /**
     * BankPayment has implemented all required methods
     * 1. initiatePayment
     * 2. paymentStatus
     * 3. getPayments
     */
    @Override
    public void initiatePayment() {
        System.out.println("Bank Payment Initiated");
    }

    @Override
    public Object paymentStatus() {
        System.out.println("Bank Payment Status");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        System.out.println("Bank Payment Payments");
        return List.of();
    }

    @Override
    public void initiateLoanSettlement() {
        throw new UnsupportedOperationException("Loan Settlement Not supported yet.");
    }

    @Override
    public void initiateRepayment() {
        throw new UnsupportedOperationException("Repayment Not supported yet.");
    }
}
