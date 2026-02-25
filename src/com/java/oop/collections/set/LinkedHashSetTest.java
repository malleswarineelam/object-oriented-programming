package com.java.oop.collections.set;

import com.java.oop.collections.Customer;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {

        LinkedHashSet<Customer> customers =new LinkedHashSet<>();

        customers.add(new Customer("111","customer1","customer1@gmail.com"));
        customers.add(new Customer("222","customer2","customer2@gmail.com"));
        customers.add(new Customer("333","customer3","customer3@gmail.com"));
        customers.add(new Customer("444","customer4","customer4@gmail.com"));
        System.out.println(customers.size());
        System.out.println(customers.isEmpty());
        customers.remove(new Customer("444","customer4","customer4@gmail.com"));
        System.out.println(customers.size());


        Iterator<Customer> customerIterator= customers.iterator();
        while(customerIterator.hasNext()){
            Customer customer=customerIterator.next();
          //  System.out.println(customer.remove(customer););
            System.out.println(customer);
            System.out.println(customers.contains(customer));

        }

    }
}
