package com.DesignPatterns.CreationalPatterns.FactoryPattern;

public class LoanFactory {

    public static final int HOME_LOAN = 1;
    public static final int EDUCATION_LOAN = 2;

    public static Loan createLoan(int type){
        if(type == HOME_LOAN){
            return new HomeLoan(12.0d);
        }
        if(type == EDUCATION_LOAN){
            return new EducationLoan(4.0d);
        }
        return null;
    }
}
