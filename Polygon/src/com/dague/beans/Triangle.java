package com.dague.beans;

public class Triangle extends Polygon {

    public Triangle() {

    }

    @Override
    public double getArea() {
        double area;
        area = 12 * dim1 * dim2;
        return area;
    }


    public String toString() {
        return "Triangle{" +
                "dim1=" + dim1 +
                ", dim2=" + dim2 +
                '}';
    }
}
