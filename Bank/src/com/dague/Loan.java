package com.dague;

public class Loan {
    public static void main(String[] args) {
        int loan = 10000;
        int emi = 1000;
        int noOfEmi = 0;

        while (loan > 0) {
            loan -= emi;
            noOfEmi++;
            System.out.println();
        }
    }
}
