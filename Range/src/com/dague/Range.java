package com.dague;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display numbers from a range of numbers and check if odd or even");
        System.out.print("Enter a range: ");
        int range = input.nextInt();

        while (range > 0) {
            if (range % 2 == 0){
                System.out.println(range+ " is even");
            }
            if (range % 2 == 1) {
                System.out.println(range+ " is odd");
            }
            range--;
        }
    }
}
