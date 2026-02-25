package com.java.oop.collections.arraylist.assignment;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository=new ProductRepository();
        String[] data= {
                "p-101,Lenovo Laptop,58999.00,10.5",
                "p-102,Dell Inspiron 15,54999.00,8.0",
                "p-103,HP Pavilion 14,62999.00,12.0",
                "p-104,Apple iPhone 14,79999.00,5.0",
                "p-105,Samsung Galaxy S23,74999.00,7.5",
                "p-106,OnePlus 11R,45999.00,9.0",
                "p-107,Boat Rockerz Headphones,2999.00,15.0",
                "p-108,Sony Bravia 43inch TV,52999.00,11.5",
                "p-109,LG Double Door Refrigerator,38999.00,13.0",
                "p-110,Canon EOS 1500D Camera,41999.00,6.5"
        };

        productRepository.loadProducts(data);

        System.out.println(" ALL PRODUCTS ");
        productRepository.displayAllProducts();


        System.out.println("\n ADD PRODUCT");
        Product newProduct = new Product("P105", "Tablet", 15000, 12);
        productRepository.save(newProduct);
        productRepository.displayAllProducts();
        //===================================
        System.out.println("\n GET PRODUCT BY ID");
        System.out.println(productRepository.getProductById("p-110"));

        System.out.println("\n UPDATE PRODUCT");
        Product updated = new Product("P102", "Mobile Pro", 22000, 7);
        productRepository.update("P102", updated);
        productRepository.displayAllProducts();

       /* System.out.println("\n DELETE");
        Product productToBeDeleted=new Product();
        productRepository.delete("P103");
        productRepository.displayAllProducts();*/



        System.out.println("\n DELETE PRODUCT BY ID");
        productRepository.deleteById("P103");
        productRepository.displayAllProducts();



        System.out.println("\n SORT BY PRICE (LOW → HIGH)");
        productRepository.sortByPriceAscending();
        productRepository.displayAllProducts();


        System.out.println("\nSORT BY PRICE (HIGH → LOW)");
        productRepository.sortByPriceDescending();
        productRepository.displayAllProducts();


        System.out.println("\nHighest Price Product : ");
        System.out.println(productRepository.getHighestPriceProduct());



        System.out.println("\nLowest Price Product : ");
        System.out.println(productRepository.getLeastPriceProduct());



        System.out.println("\nMax Discount Product : ");
        System.out.println(productRepository.getMaxDiscountProduct());



        System.out.println("\nTotal Value of Products : ");
        System.out.println(productRepository.getTotalValue());



        System.out.println("\nAverage Price of Products : ");
        System.out.println(productRepository.getAveragePrice());



        System.out.println("\nProducts above 10000 : ");
        System.out.println(productRepository.countProductsAbovePrice(10000));



        System.out.println("\nProducts with discount > 10%");
        List<Product> discountProducts =
                productRepository.getProductsWithDiscountAbove(10);

        for (Product product : discountProducts) {
            System.out.println(product);
        }


       /* productRepository.update("P103", new Product("P103","Wireless Headphones",3000,6));

        productRepository.delete("P104");

        productRepository.sortByPriceAscending();
        productRepository.displayAllProducts();

        productRepository.sortByPriceDescending();
        productRepository.displayAllProducts();*/

    }
}
