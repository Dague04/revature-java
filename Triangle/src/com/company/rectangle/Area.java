package com.company.rectangle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the area of a rectangle");
        System.out.print("Enter length of rectangle: ");
        int len = input.nextInt();

        System.out.print("Enter width of triangle: ");
        int width = input.nextInt();

        double area = (len * width);

        System.out.println("The area of a rectangle is "+ area);
    }
}
