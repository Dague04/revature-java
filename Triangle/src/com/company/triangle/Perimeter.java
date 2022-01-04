package com.company.triangle;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the perimeter of a triangle");
        System.out.print("Enter side1 of triangle: ");
        int side1 = input.nextInt();

        System.out.print("Enter side2 of triangle: ");
        int side2 = input.nextInt();

        System.out.print("Enter side3 of triangle: ");
        int side3 = input.nextInt();

        double perimeter = side1 * side2 * side3;

        System.out.println("The perimeter of a triangle is "+ perimeter);
    }
}
