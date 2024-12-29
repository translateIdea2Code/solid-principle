package com.translateIdea2Code.interface_seggregation.solution;

public interface Loan extends Payment {
    void initiateLoanSettlement();

    void initiateRepayment();
}
