package com.DesignPatterns.CreationalPatterns.FactoryPattern;

public class EducationLoan extends Loan{

    public EducationLoan(double interestRate){
        setInterestRate(interestRate);
    }
    @Override
    protected void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
