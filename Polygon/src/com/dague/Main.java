package com.dague;

import com.dague.beans.Polygon;
import com.dague.beans.Rectangle;
import com.dague.beans.Triangle;

public class Main {
    public static void main(String[] args) {
        Polygon triangle = new Triangle();
        triangle.setDim1(3);
        triangle.setDim2(6);
        double trianArea = triangle.getArea();

        Polygon rectangle = new Rectangle();
        rectangle.setDim1(5);
        rectangle.setDim2(7);
        double rectArea = rectangle.getArea();

        System.out.println("The area of a triangle with "+triangle+ " is "+trianArea);
        System.out.println("The area of a rectangle with "+rectangle+ " is "+rectArea);
    }
}
