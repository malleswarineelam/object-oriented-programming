package com.java.oop.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1;
        employee1 = new Employee();

        System.out.println("default constructor initialised");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        System.out.println(" ");
        System.out.printf("%-20s %-20d%n", "Employee ID        : ", employee1.id);
        System.out.printf("%-20s %-20s%n", "Employee Name      : ", employee1.name);
        System.out.printf("%-20s %-20.2f%n", "Salary             : ", employee1.salary);
        System.out.printf("%-20s %-20s%n", "Designation        : ", employee1.designation);
        System.out.printf("%-20s %-20.1f%n", "Experience (Years) : ", employee1.experience);
        System.out.println(" ");

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");


        Employee employee2 = new Employee(201, "Malleswari", 45000.00F, "Software Engineer", 2.0F);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("parameterized initialised");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.printf("%-10s %-15s %-15s %-20s %-10s%n",
                "ID", "NAME", "SALARY", "DESIGNATION", "EXP");

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.printf("%-10d %-15s %-15.2f %-20s %-10.1f%n",
                employee2.id,
                employee2.name,
                employee2.salary,
                employee2.designation,
                employee2.experience);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");

    }
    }

