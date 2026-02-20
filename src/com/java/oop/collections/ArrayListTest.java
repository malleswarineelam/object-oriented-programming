package com.java.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {//create a list,add elements,print,size,iterator for remove,get of index,add (index,elemet),print list,remove (index) etc,for each,set(index,element)
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("111", "customer1", "customer1@gmail.com"));
        customers.add(new Customer("222", "customer2", "customer2@gmail.com"));
        customers.add(new Customer("333", "customer3", "customer3@gmail.com"));
        customers.add(new Customer("444", "customer4", "customer4@gmail.com"));
        customers.add(new Customer("444", "customer4", "customer4@gmail.com"));
        System.out.println(customers);
        System.out.println(customers.size());
        customers.remove(new Customer("444", "customer4", "customer4@gmail.com"));
        System.out.println(customers);
        System.out.println(customers.size());
        System.out.println("Second customer : " + customers.get(1));
        customers.add(4,new Customer("555","customer5","customer5@gmail.com"));
        System.out.println("after adding new customer" + customers);
        customers.set(4,new Customer("666","Malleswari","neelam1@gmail.com"));
        System.out.println(customers);

        /*Iterator<Customer> customerIterator= customers.iterator();
        while(customerIterator.hasNext()){
            Customer customer=customerIterator.next();
            //  System.out.println(customer.remove(customer););
            System.out.println(customer);
            System.out.println(customers.contains(customer));
    }*/
    }
}
