package com.dague.beans;

import com.dague.calculator.Calculator;

import static com.dague.calculator.Calculator.brand;

public class Main {
    public static void main(String[] args) {

        //important field brand
        brand = "Cannon";

        //Creating a new calculator
        Calculator cal1 = new Calculator();
        cal1.setNum1(3);
        cal1.setNum2(7);

        int sum1 = cal1.add();

        //Creating another calculator
        Calculator cal2 = new Calculator();
        cal2.setNum1(11);
        cal2.setNum2(7);

        int sum2 = cal2.add();



        System.out.println("The sum for Calculator1 is: "+sum1);
        System.out.println("The sum for Calculator2 is: "+sum2);
        System.out.println("The brand of these calculators is: "+brand);


    }
}
