package com.company.rectangle;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the perimeter of a rectangle");
        System.out.print("Enter length of triangle: ");
        int len = input.nextInt();

        System.out.print("Enter width of triangle: ");
        int width = input.nextInt();

        double perimeter = 2 * (len * width);

        System.out.println("The perimeter of a rectangle is "+ perimeter);
    }
}
