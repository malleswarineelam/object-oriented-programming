package com.java.oop.collections.arraylist.assignment;

import java.util.*;

public class ProductRepository {
    private ArrayList<Product> products =new ArrayList<>();

    public void loadProducts(String[] data){
        for(String line:data){
            String[] parts=line.split(",");//split by comma
            Product product = new Product(parts[0],parts[1],Double.parseDouble(parts[2]),Float.parseFloat(parts[3]));//add each element
            products.add(product);//adding as object
        }
    }

    public void save(Product product)
    {
        products.add(product);
    }

    public Product getProductById(String id){
        for(Product product:products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    public void update(String id, Product product){
        for(Product p:products){
            if(product.getId().equals(id)){
                Product newProduct = new Product();
                product.setName(newProduct.getName());
                product.setMaxRetailPrice((newProduct.getMaxRetailPrice()));
                product.setDiscountPercentage(newProduct.getDiscountPercentage());
                return;
            }
        }

    }

    public void delete(String id){
        Iterator<Product> iterator = products.iterator();

        while(iterator.hasNext()){
            Product p = iterator.next();
            if(p.getId().equals(id)){
                iterator.remove();
            }
        }
    }
    public void displayAllProducts(){
        for(Product product:products){
            product.display();
        }
    }


    public void sortByPriceAscending(){
        products.sort(Comparator.comparing(Product::getMaxRetailPrice));
    }
    public void sortByPriceDescending(){
        products.sort(Comparator.comparing(Product::getMaxRetailPrice).reversed());
    }


    public Product getHighestPriceProduct(){
        return Collections.max(products,Comparator.comparing(Product::getMaxRetailPrice));
    }
    public Product getLeastPriceProduct(){
        return Collections.min(products,Comparator.comparing(Product::getMaxRetailPrice));
    }
    public Product getMaxDiscountProduct(){
        return Collections.max(products,Comparator.comparing(Product::getDiscountPercentage));
    }

    public double getTotalValue(){
        double total = 0;
        for(Product product : products){
            total =total + product.getMaxRetailPrice();
        }
        return total;
    }

    public double getAveragePrice(){
        return getTotalValue() / products.size();
    }

    public long countProductsAbovePrice(double price){
        return products.stream()
                .filter(product -> product.getMaxRetailPrice() > price).count();
    }

    public List<Product> getProductsWithDiscountAbove(float discount){
        List<Product> result = new ArrayList<>();

        for(Product product : products){
            if(product.getDiscountPercentage() > discount){
                result.add(product);
            }
        }
        return result;
    }
}


