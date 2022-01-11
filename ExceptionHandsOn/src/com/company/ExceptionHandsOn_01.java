package com.company;

public class ExceptionHandsOn_01 {

    public static void main(String[] args) {
        try {
            String[] names = {"Lisa", "Mark", "Kat"};
            System.out.println(names[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
