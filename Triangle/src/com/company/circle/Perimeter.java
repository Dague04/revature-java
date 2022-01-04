package com.company.circle;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the perimeter of a circle");

        System.out.print("Enter radius of circle: ");
        int radius = input.nextInt();

        double perimeter = 2 * 3.14159 * radius;

        System.out.println("The area of a circle is "+ perimeter);
    }
}
