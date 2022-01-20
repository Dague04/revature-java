package com.dague;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int depnumb;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int depnumb) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.depnumb = depnumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepnumb() {
        return depnumb;
    }

    public void setDepnumb(int depnumb) {
        this.depnumb = depnumb;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", depnumb=" + depnumb +
                '}';
    }
}
