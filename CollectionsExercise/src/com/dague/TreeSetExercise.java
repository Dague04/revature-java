package com.dague;

import java.util.TreeSet;

public class TreeSetExercise {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Atlanta");
        treeSet.add("New York");
        treeSet.add("Baltimore");
        treeSet.add("New Jersey");

        System.out.println(treeSet.first());
        System.out.println(treeSet.ceiling("N"));
        System.out.println(treeSet.pollFirst());
    }
}
