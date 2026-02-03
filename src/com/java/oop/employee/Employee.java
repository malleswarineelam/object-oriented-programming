package com.java.oop.employee;

public class Employee {

    int id;
    String name;
    float salary;
    String designation;
    float experience;   // in years

    // Default Constructor
    Employee() {
        id = 101;
        name = "John Doe";
        salary = 30000.00F;
        designation = "Software Engineer";
        experience = 1.5F;
    }

    // Parameterized Constructor
    public Employee(int id, String name, float salary, String designation, float experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.experience = experience;
    }
}
