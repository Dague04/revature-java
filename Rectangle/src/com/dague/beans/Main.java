package com.dague.beans;

import com.dague.beans.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {

        //create a rectangle object
        Rectangle rectangle = new Rectangle(2, 5);

        //get area of the rectangle object
        double area = rectangle.getArea();

        //get perimeter of the rectangle object
        double perimeter = rectangle.getPerimeter();

        System.out.println("The area of rectangle with "+rectangle.toString()+ " is "+area);
        System.out.println("The perimeter of rectangle with "+rectangle.toString()+ " is "+perimeter);
    }
}
