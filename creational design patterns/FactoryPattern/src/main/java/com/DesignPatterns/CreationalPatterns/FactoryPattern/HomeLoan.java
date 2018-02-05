package com.DesignPatterns.CreationalPatterns.FactoryPattern;

public class HomeLoan extends Loan {


    public HomeLoan(double interestRate){
        setInterestRate(interestRate);
    }
    @Override
    protected void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
