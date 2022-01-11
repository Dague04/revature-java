package com.edu.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>, Serializable {
    int id;
    int age;
    String firstName;
    String lastName;
    String course;

    public String toCSV(){
        return id +", "+age+", "+firstName+", "+lastName+", "+course;
    }

    public static Student parseStudent(String csvStudent){
        String[] values = csvStudent.split(",");
        int id = Integer.parseInt(values[0].trim());
        int age = Integer.parseInt(values[1].trim());
        String firstName = values[2].trim();
        String lastName = values[3].trim();
        String course = values[4].trim();
        Student student = new Student(id, age, firstName, lastName, course);
        return student;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.age - otherStudent.age;
    }
}
