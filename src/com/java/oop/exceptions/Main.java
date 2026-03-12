package com.java.oop.exceptions;

public class Main {
    public static void main(String[] args) {

        ProductController productController=new ProductController();
        Product product=null;
        try {
            product = productController.saveProduct(new Product("111","apple laptop",44000.44));
        } catch (ProductExistsException e) {
            System.out.println(e.getMessage());
        }
        if(product != null)
            System.out.println("Customer saved successfully");

        try {
            product = productController.saveProduct(new Product("111","apple laptop",44000.44));
        } catch (ProductExistsException e) {
            System.out.println(e.getMessage());
        }

    }
}
