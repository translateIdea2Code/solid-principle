package com.translateIdea2Code.interface_seggregation.problem;

import java.util.List;

public interface Payment {

    /**
     * Interface having 3 methods
     */
    void initiatePayment();

    Object paymentStatus();

    List<Object> getPayments();

    /**
     * New Functionality was asked by business
     * Needed for Loan Payment
     */

    void initiateLoanSettlement();

    void initiateRepayment();

}
