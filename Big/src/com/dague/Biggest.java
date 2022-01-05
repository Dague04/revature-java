package com.dague;

public class Biggest {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 16;
        int num3 = 56;

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The biggest number is: "+num1);
            } else{
                System.out.println("The biggest number is: "+num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("The biggest number is: "+num2);
            } else {
                System.out.println("The biggest number is: "+num3);
            }
        }
    }
}
