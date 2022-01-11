package com.company;

public class ExceptionHandsOn_02 {
    public static void main(String[] args) {
        try {
            thereMaybeAnExceptionInThisMethod();
        }
        catch (RuntimeException ex) {
            System.out.println("An exception occurred: "+ ex);
        }
    }

    public static void thereMaybeAnExceptionInThisMethod() {
        try {
            int[] num = {1, 4, 6, 7};
            System.out.println(num[33]);
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
