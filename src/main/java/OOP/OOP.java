package OOP;

import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class OOP {
    private final Date loanDate;
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfYears;
    Double doubleval = (double) Double.valueOf("12. 4").compareTo(Double.valueOf("12.3"));



    OOP() {
        this(2.3, 6000, 1000, 12.40);

    }

    OOP(double annualInterestRate, double loanAmount, int numberOfYears, double doubleVal) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        loanDate = new Date();
        this.doubleval = doubleVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual interest rate , for example 8.25: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years :");
        int numberOfYears = sc.nextInt();

        System.out.print("Enter loanAmount :");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();

        OOP loan = new OOP(annualInterestRate, loanAmount, numberOfYears, doubleVal);
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f%n" + "The payment is %.2f" +"The double value is %.3f", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.numberOfYears, loan.getDoubleval());

//        double d = 5.4;
//        Double.valueOf(d);

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public int setNumberOfYears(int newYear) {
        return this.numberOfYears = newYear;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double newLoan) {
        this.loanAmount = newLoan;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Double getDoubleval() {
        return doubleval;
    }


    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate -
                (1 / Math.pow(1 + monthlyInterestRate, (double) numberOfYears / 12));
        return monthlyPayment;

    }

}

// class relationship
// processing primitives data types as objects classes
// converting a primitive value into a wrapped object is called boxing
// converting a wrapped object back to a primitive value is called unboxing.

