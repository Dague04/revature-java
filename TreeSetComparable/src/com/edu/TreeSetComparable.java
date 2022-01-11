package com.edu;

import com.edu.beans.Student;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {
        Student newStudent = new Student(102, 19,"Martin","King","Accounting") ;
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(103, 45,"Scott","Tiger","Programming I"));
        students.add(Student.parseStudent("105, 34, Blake, Paul, blake@gmail.com"));
        students.add(new Student(101, 43,"John","Mathew","History"));
        students.add(new Student(102, 26,"Martin","King","Algebra"));
        students.add(new Student(103, 56,"Scott","Tiger","Calculus"));
        students.add(new Student(104, 64, "Alen","Paul","Biology II"));
        students.add(newStudent);


        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }

}
