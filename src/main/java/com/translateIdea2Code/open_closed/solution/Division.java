package com.translateIdea2Code.open_closed.solution;

public class Division implements CalculatorOperation{

    private double first;
    private double second;
    private double result;

    @Override
    public void process() {
        result = first / second;
    }
}
