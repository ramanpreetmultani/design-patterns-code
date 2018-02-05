package com.DesignPatterns.CreationalPatterns.FactoryPattern;

public abstract class Loan {
    protected double interestRate;

    protected abstract void setInterestRate(final double interestRate);
    public double getInterest(){
        return 5000.0d * interestRate / 100.0d;
    }
}
