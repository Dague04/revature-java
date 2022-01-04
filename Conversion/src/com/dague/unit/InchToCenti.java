package com.dague.unit;

import java.util.Scanner;

public class InchToCenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converting inch to centimeter");
        System.out.print("Enter the inch unit you want to convert: ");

        double inch = input.nextDouble();
        double cent = inch * 2.54;

        System.out.println("Your answer in centimeter is "+ cent);
    }
}
