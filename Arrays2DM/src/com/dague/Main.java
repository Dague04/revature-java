package com.dague;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many arrays? ");
        int m = sc.nextInt();
        System.out.print("How many elements in each array? ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements below: ");
        for(int c = 0; c < arr.length; c++) {
            for(int d = 0; d < arr[c].length; d++) {
                arr[c][d] = sc.nextInt();
            }
        }

        for (int c = 0; c < arr.length; c++) {
            for(int d = 0; d < arr[c].length; d++) {
                System.out.print(arr[c][d]+" ");

            }
            System.out.println();

        }

        for (int c = 0; c < arr.length; c++) {
            int total = 0;
            for(int d = 0; d < arr[c].length; d++) {
                total += arr[c][d];
            }
            System.out.println();
            System.out.print("The sum for row " +(c + 1)+ " is "+total);
        }
    }

}
