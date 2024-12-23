package com.translateIdea2Code.open_closed.problem;

import java.security.InvalidParameterException;

public class CalculatorMain {

    public static void main(String[] args) {

        //Although this might look like Open Closed, but it's not
        // Lets say we have requirement to support
        // Division
        // Multiplication
        // We have to Open Class for Modification

    }

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("operation is null");
        }

        if (operation instanceof Addition addition) {
            addition.setResult(addition.getFirstNumber() + addition.getSecondNumber());
        } else if (operation instanceof Subtraction subtraction) {
            subtraction.setResult(subtraction.getFirst() - subtraction.getSecond());
        }
    }
}
