package com.dague;

import com.dague.interfaces.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        int addRes = add.process(5,7);
        System.out.println("Add operation result: "+addRes);

        Calculator subtract = (a, b) -> a - b;
        int subtractRes = subtract.process(5,7);
        System.out.println("Subtract operation result: "+subtractRes);

        Calculator multiply = (a, b) -> a * b;
        int MultiplyRes = multiply.process(5,7);
        System.out.println("Multiply operation result: "+MultiplyRes);

        Calculator divide = (a, b) -> a / b;
        int divideRes = divide.process(20,2);
        System.out.println("Add operation result: "+divideRes);
    }
}
