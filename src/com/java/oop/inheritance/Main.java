package com.java.oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("1", "John Doe", "john@example.com", "1234567890");
        customer.signup();
        customer.login();
        customer.displayCustomerDetails();

        RegularCustomer regularCustomer = new RegularCustomer(2342,23);
        System.out.println("Id : " + regularCustomer.getId());
        System.out.println("Name : " + regularCustomer.getName());
        System.out.println("Reward Points : " + regularCustomer.getRewardPoints());
        System.out.println("Total Orders : " + regularCustomer.getTotalOrders());

        RegularCustomer regularCustomer1 = new RegularCustomer("2","Malleswari Neelam","malli@gmail.com","32452323",67567,35,500);
        regularCustomer1.signup();
        regularCustomer1.login();
        regularCustomer1.displayCustomerDetails();

        PremiumCustomer premiumCustomer = new PremiumCustomer("3","Malleswari Neelam1","malli1@gmail.com","54645345",true,500);
        premiumCustomer.signup();
        premiumCustomer.login();
        premiumCustomer.displayCustomerDetails();
    }
}
