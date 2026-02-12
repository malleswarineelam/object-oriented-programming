package com.java.oop.arrays;

public class Main {
    public static void main(String[] args) {
        Customer[] customers=new Customer[3];

        customers[0]=new Customer("1","Customer1","customer1@gmail.com");
        customers[1]=new Customer("2","Customer2","customer2@gmail.com");
        customers[2]=new Customer("3","Customer3","customer3@gmail.com");

        for(int i=0;i<customers.length;i++){
            customers[i].displayCustomersDetails();
        }

    }
}
