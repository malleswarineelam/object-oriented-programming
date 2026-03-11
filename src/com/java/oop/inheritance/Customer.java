package com.java.oop.inheritance;

import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String contactNo;

    public Customer() {
        System.out.println("Customer Constructor Called");

    }

    public Customer(String id, String name, String email, String contactNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public boolean signup(){
        System.out.println("Customer Signup");
        return true;
    }

    public boolean login(){
        System.out.println("Customer Login");
        return true;
    }

    public void displayCustomerDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Contact No : " + contactNo);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(contactNo, customer.contactNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, contactNo);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
