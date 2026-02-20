package com.java.oop.collections;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet <String> nameSet=new TreeSet<>();
        nameSet.add("Malleswari");
        nameSet.add("Nayeem");
        nameSet.add("Prasanna");
        nameSet.add("Sujit");
        nameSet.add("Malleswari");

        System.out.println(nameSet);
        TreeSet <Customer> customerSet=new TreeSet<>();
        customerSet.add(new Customer("111","Malleswari","customer1@gmail.com"));
        customerSet.add(new Customer("222","Mahesh","customer2@gmail.com"));
        customerSet.add(new Customer("333","Babu","customer3@gmail.com"));
        customerSet.add(new Customer("444","Neelam","customer4@gmail.com"));
        System.out.println(customerSet);

    }
}
