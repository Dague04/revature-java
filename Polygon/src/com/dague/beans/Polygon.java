package com.dague.beans;

public abstract class Polygon {
    int dim1;
    int dim2;

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    public double getArea() {
        return 0.0;
    }
}
