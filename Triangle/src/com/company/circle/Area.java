package com.company.circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate area of a circle");

        System.out.print("Enter the radius of triangle: ");
        int radius = input.nextInt();

        double area = radius * radius * 3.14159;

        System.out.println("The area of a triangle is "+ area);

    }
}
