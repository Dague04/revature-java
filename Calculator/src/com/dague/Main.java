package com.dague;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.num1 = 3;
        cal1.num2 = 3;

        int sum = cal1.add();

        System.out.println("The sum is: "+sum);
    }
}
