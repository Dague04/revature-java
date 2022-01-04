package com.dague.temperature;

import java.util.Scanner;

public class CelsToFar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converting Celsius to Fahrenheit");
        System.out.print("Enter the temperature you want to convert in Celsius: ");

        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5.0) * celsius + 32;

        System.out.println("The temperature in Fahrenheit is "+ fahrenheit);
    }
}
