package com.dague.beans;

public class Rectangle extends Polygon {

    public Rectangle() {
    }

    @Override
    public double getArea() {
        double area;
        area = dim1 * dim2;
        return area;
    }


    public String toString() {
        return "Rectangle{" +
                "dim1=" + dim1 +
                ", dim2=" + dim2 +
                '}';
    }
}
