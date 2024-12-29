package com.translateIdea2Code.interface_seggregation.solution;

import java.util.List;

public class BankPayment implements Bank {

    @Override
    public void initiatePayment() {
        System.out.println("Bank Payment Initiated");
    }

    @Override
    public Object status() {
        System.out.println("Bank Payment Status");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        System.out.println("Bank Payment getPayments");
        return List.of();
    }
}
