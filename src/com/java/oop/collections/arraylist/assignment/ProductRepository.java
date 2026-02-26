package com.java.oop.collections.arraylist.assignment;

import java.util.*;

public class ProductRepository {
    private ArrayList<Product> productArrayList =new ArrayList<>();

     public ArrayList<Product> loadProductsFromData(String[] data){
    for(String line:data){
            String[] parts=line.split(",");//split by comma
            Product product = new Product(parts[0],parts[1],Double.parseDouble(parts[2]),Float.parseFloat(parts[3]));//add each element //correct
            productArrayList.add(product); //adding as object
            }
    return productArrayList;
     }


    public Product save(Product product){
    productArrayList.add(product);
    return product;
    }



    public Product getProductById(String id){
        for(Product product: productArrayList){
            if(product.getId().equals(id)){
                return product;//correct
            }
        }
        return null;
    }


    public Product update(String id, Product product){
        Product byId = getProductById(id);
        if(byId == null)
            return null;
        else {
            int index = productArrayList.indexOf(byId);
            productArrayList.set(index,product);
        }
        return product;
    }

    public void delete(Product product){
        productArrayList.remove(product);}

    public void deleteById(String id){
            Product byId=getProductById(id);
            productArrayList.remove(byId);//correct
    }

       /* Iterator<Product> iterator = products.iterator();

        while(iterator.hasNext()){

            Product p = iterator.next();
            if(p.getId().equals(id)){
                iterator.remove();
            }
        }
    }*/
       public void displayAllProducts() {

           System.out.printf("%-8s | %-25s | %-12s | %-8s\n",
                   "ID", "PRODUCT NAME", "PRICE", "DISC");

           System.out.println("---------------------------------------------------------------");
           for (Product p : productArrayList) {
               System.out.printf("%-8s | %-25s | ₹%-10.2f | %-7.2f%%\n",
                       p.getId(),
                       p.getName(),
                       p.getMaxRetailPrice(),
                       p.getDiscountPercentage());
           }
       }


    public void sortByPriceAscending(){
        for (int i = 0; i < productArrayList.size() - 1; i++) {

            for (int j = 0; j < productArrayList.size() - i - 1; j++) {

                if (productArrayList.get(j).getMaxRetailPrice() > productArrayList.get(j + 1).getMaxRetailPrice()) {

                    Product temp = productArrayList.get(j);
                    productArrayList.set(j, productArrayList.get(j + 1));
                    productArrayList.set(j + 1, temp);
                }
            }
        }
    }


    public void sortByPriceDescending(){
      //  List<Product> sortedlist=new ArrayList<>();

        for (int i = 0; i < productArrayList.size() - 1; i++) {

            for (int j = 0; j < productArrayList.size() - i - 1; j++) {

                if (productArrayList.get(j).getMaxRetailPrice() < productArrayList.get(j + 1).getMaxRetailPrice()) {

                    Product temp = productArrayList.get(j);
                    productArrayList.set(j, productArrayList.get(j + 1));
                    productArrayList.set(j + 1, temp);
                }
            }
        }
    }


    public Product getHighestPriceProduct() {

        if(productArrayList.isEmpty()) return null;

        Product highest = productArrayList.get(0);  // assume first is highest

        for(Product p : productArrayList){
            if(p.getMaxRetailPrice() > highest.getMaxRetailPrice()){
                highest = p;   // update highest
            }
        }

        return highest;
    }
    public Product getLeastPriceProduct() {

        if(productArrayList.isEmpty()) return null;

        Product least = productArrayList.get(0);

        for(Product p : productArrayList){
            if(p.getMaxRetailPrice() < least.getMaxRetailPrice()){
                least = p;
            }
        }

        return least;
    }
    public Product getMaxDiscountProduct() {

        if(productArrayList.isEmpty()) return null;

        Product maxDiscount = productArrayList.get(0);

        for(Product p : productArrayList){
            if(p.getDiscountPercentage() > maxDiscount.getDiscountPercentage()){
                maxDiscount = p;
            }
        }

        return maxDiscount;
    }

    public double getTotalValue(){
        double total = 0;
        for(Product product : productArrayList){
            total =total + product.getMaxRetailPrice();
        }
        return total;
    }

    public double getAveragePrice(){
        return getTotalValue() / productArrayList.size();
    }

   /* public long countProductsAbovePrice(double price){
        return products.stream()
                .filter(product -> product.getMaxRetailPrice() > price).count();
    }*/
   public int countProductsAbovePrice(double price) {

       int count = 0;

       for (Product p : productArrayList) {
           if (p.getMaxRetailPrice() > price) {
               count++;
           }
       }

       return count;
   }

    public List<Product> getProductsWithDiscountAbove(float discount){
        List<Product> result = new ArrayList<>();

        for(Product product : productArrayList){
            if(product.getDiscountPercentage() > discount){
                result.add(product);
            }
        }
        return result;
    }
}


