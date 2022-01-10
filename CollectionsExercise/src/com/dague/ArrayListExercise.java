package com.dague;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(25);
        System.out.println(intList.toString());

        // set element at index 0 to 33
        intList.set(0,33);

        System.out.println(intList.toString());

        List<String> stringList = new ArrayList<>();
        stringList.add("do");
        stringList.add("re");
        stringList.add("mi");
        stringList.forEach(n -> System.out.println(n.toUpperCase()));
    }
}
