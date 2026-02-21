package com.java.oop.strings;

import java.util.HashSet;
import java.util.Iterator;

public class ProductService {

    private HashSet<Product> products;

    public ProductService() {
        this.products = new HashSet<>();
    }

    //methods
    HashSet<Product> getProducts(String[] productsData){

        //1.
        for(String productData : productsData){
            // System.out.println(productData);
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            products.add(product);
        }
        return products;

    }
    double calculateFinalPrice(double maxRetailPrice, float discountPercentage){
        return maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
    }
    double calculateFinalPrice(Product product){
        return product.getMaxRetailPrice() - (product.getMaxRetailPrice() * product.getDiscountPercentage() / 100);
    }

    void displayProductDetails(Product product){
        System.out.println("=====================================");
        System.out.println("Id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Max Retail Price: " + product.getMaxRetailPrice());
        System.out.println("Discount Percentage: " + product.getDiscountPercentage());
        System.out.println("Final Price: " + calculateFinalPrice(product));
    }



    HashSet<Product> getProductsById(String[] ids){
        HashSet<Product> productsById = new HashSet<>();
        for(String id: ids){
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()){
                Product product = iterator.next();
                if(product.getId().equals(id))
                    productsById.add(product);
            }
        }
        return productsById;

    }
}
