package com.translateIdea2Code.open_closed.solution;

public class Addition implements CalculatorOperation{

    private double firstNumber;
    private double secondNumber;
    private double result;

    @Override
    public void process() {
        result = firstNumber + secondNumber;
    }
}
