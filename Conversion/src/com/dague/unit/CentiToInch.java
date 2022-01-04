package com.dague.unit;

import java.util.Scanner;

public class CentiToInch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converting Centimeter to Inch");
        System.out.print("Enter the centimeter unit you want to convert: ");

        double cent = input.nextDouble();
        double inch = cent * .3937;

        System.out.println("Your answer in inches is "+ inch);
    }
}
