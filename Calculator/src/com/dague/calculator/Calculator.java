package com.dague.calculator;

public class Calculator {
    int num1;
    int num2;
    static public String brand;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // method to get the first number field
    public int getNum1() {
        return num1;
    }

    // method to set the first number
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // method to get the first number field
    public int getNum2() {
        return num2;
    }

    // method to set the first number
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //method to add the two number
    public int add(){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    @Override
    public String toString() {
        return "Calculator {" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
