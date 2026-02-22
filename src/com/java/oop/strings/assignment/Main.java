package com.java.oop.strings.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] productsData = {
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
        ProductService productService = new ProductService();
        HashSet<Product> productsSet = productService.getProducts(productsData);
        Iterator<Product> iterator = productsSet.iterator();
        while (iterator.hasNext()){
            productService.displayProductDetails(iterator.next());
        }


    }
}