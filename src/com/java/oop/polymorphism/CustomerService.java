package com.java.oop.polymorphism;

import com.java.oop.inheritance.Customer;
import com.java.oop.inheritance.PremiumCustomer;
import com.java.oop.inheritance.RegularCustomer;

public class CustomerService {

    public void displayCustomerDetails(Customer customer){
        System.out.println("Customer");
        customer.displayCustomerDetails();
    }

   /* public void displayCustomerDetails(PremiumCustomer premiumCustomer){
        System.out.println("Premium Customer");
        premiumCustomer.displayCustomerDetails();
    }
    public void displayCustomerDetails(RegularCustomer regularCustomer){
        System.out.println("Regular Customer");
        regularCustomer.displayCustomerDetails();
    }*/
}