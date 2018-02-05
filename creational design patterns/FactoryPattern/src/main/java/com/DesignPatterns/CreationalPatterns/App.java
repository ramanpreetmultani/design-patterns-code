package com.DesignPatterns.CreationalPatterns;

import com.DesignPatterns.CreationalPatterns.FactoryPattern.Loan;
import com.DesignPatterns.CreationalPatterns.FactoryPattern.LoanFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Loan homeLoan = LoanFactory.createLoan(LoanFactory.HOME_LOAN);
        System.out.println("Interest on home loan is " + homeLoan.getInterest());

        Loan eduLoan = LoanFactory.createLoan(LoanFactory.EDUCATION_LOAN);
        System.out.println("Interest on education loan is " + eduLoan.getInterest());

    }
}
