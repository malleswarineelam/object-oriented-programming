package com.java.oop.product;

public class Product {
    int id;
    String name;
    float maxRetailPrice;
    int quantity;
    float centralTax;
   // char memberShip;

    Product(){
        id=123;
        name="dell laptop";
        maxRetailPrice=50000.00F;
        quantity=10;
        centralTax=2.5F;
    }

    public Product(int id, String name, float maxRetailPrice, int quantity, float centralTax) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.quantity = quantity;
        this.centralTax = centralTax;
    }
    public void display(){
        System.out.println("default constructor initialised");
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product maxRetailPrice : " + maxRetailPrice);
        System.out.println("centralTax : " + centralTax);
        System.out.println("quantity : " + quantity);
        System.out.println(" ");
    }
}

