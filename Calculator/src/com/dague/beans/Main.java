package com.dague.beans;

import com.dague.calculator.Calculator;

import static com.dague.calculator.Calculator.brand;

public class Main {
    public static void main(String[] args) {

        //important field brand
        brand = "Cannon";

        //Creating a new calculator
        Calculator cal1 = new Calculator(3, 7);
        int sum1 = cal1.add();

        //Creating another calculator
        Calculator cal2 = new Calculator(11, 7);
        int sum2 = cal2.add();

        System.out.println("The sum given by Calculator1 with "+cal1.toString()+ " is: "+sum1);
        System.out.println("The sum given by Calculator2 with "+cal2.toString()+" is: "+sum2);
        System.out.println("The brand of these calculators is: "+brand);


    }
}
