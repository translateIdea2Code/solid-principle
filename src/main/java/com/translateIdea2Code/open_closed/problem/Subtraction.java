package com.translateIdea2Code.open_closed.problem;

public class Subtraction implements CalculatorOperation {

    private double first;
    private double second;
    private double result;

    public Subtraction(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
