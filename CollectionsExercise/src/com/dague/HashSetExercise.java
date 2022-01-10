package com.dague;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ice cream");
        set.add("Pancake");
        set.add("Grapes");

        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Grapes");

        set.retainAll(set2);

        // Retaining common elements in set and set2
        System.out.println(set);
    }
}
