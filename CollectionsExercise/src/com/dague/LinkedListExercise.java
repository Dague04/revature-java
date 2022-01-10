package com.dague;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>(Arrays.asList(1,4,7,22,7,9));

        System.out.println(intList.toString());

        // add 55 to the front of the list
        intList.addFirst(55);
        System.out.println(intList.toString());

        LinkedList<Integer> intList2 = (LinkedList<Integer>) (intList.clone());
        System.out.println("Cloned intList1 "+intList2);


    }
}
