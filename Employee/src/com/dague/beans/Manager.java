package com.dague.beans;

public class Manager extends Employee {
    int qualification;


    public Manager(int id, String name, int qualification) {
        super(id, name);
        this.qualification = qualification;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification=" + qualification +
                '}';
    }
}
