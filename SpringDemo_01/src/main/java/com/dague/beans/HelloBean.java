package com.dague.beans;

public class HelloBean {
    int slno;
    String name;

    public HelloBean() {
    }

    public HelloBean(int slno, String name) {
        this.slno = slno;
        this.name = name;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "slno=" + slno +
                ", name='" + name + '\'' +
                '}';
    }
}
