package com.translateIdea2Code.liskov_substitution.solution;

public interface WithDrawableAccount extends Account{

    boolean withdraw(double amount);
}
