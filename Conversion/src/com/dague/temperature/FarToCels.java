package com.dague.temperature;

import java.util.Scanner;

public class FarToCels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converting Fahrenheit to Celsius");
        System.out.print("Enter the temperature you want to convert in Fahrenheit: ");

        double fahrenheit = input.nextDouble();
        double celsius = ((fahrenheit - 32.0) * 5) / 9;

        System.out.println("The temperature in Celsius is "+ celsius);
    }
}
