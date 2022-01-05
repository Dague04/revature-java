package com.dague.beans.rectangle;

public class Rectangle {
    int length;
    int width;

    //constructor of a rectangle with length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // return the length field
    public int getLength() {
        return length;
    }

    //set the length
    public void setLength(int length) {
        this.length = length;
    }

    //return the width field
    public int getWidth() {
        return width;
    }

    //set the width
    public void setWidth(int width) {
        this.width = width;
    }

    //return the area of the rectangle
    public double getArea() {
        return length * width;
    }

    //return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }


    public String toString() {
        return "Rectangle {" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
