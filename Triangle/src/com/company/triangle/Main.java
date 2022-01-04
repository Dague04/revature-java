package com.company.triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        int base = input.nextInt();

        System.out.print("Enter height of triangle: ");
        int height = input.nextInt();

        double area = (base * height) / 2;

        System.out.println("The area of a triangle is "+ area);


    }
}
