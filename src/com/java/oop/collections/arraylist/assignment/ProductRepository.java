package com.java.oop.collections.arraylist.assignment;

import java.util.*;

public class ProductRepository {
    private ArrayList<Product> products =new ArrayList<>();

     public ArrayList<Product> loadProductsFromData(String[] data){
    for(String line:data){
            String[] parts=line.split(",");//split by comma
            Product product = new Product(parts[0],parts[1],Double.parseDouble(parts[2]),Float.parseFloat(parts[3]));//add each element //correct
            products.add(product); //adding as object
            }
    return products;
     }


    public Product save(Product product){
    products.add(product);
    return product;
    }



    public Product getProductById(String id){
        for(Product product:products){
            if(product.getId().equals(id)){
                return product;//correct
            }
        }
        return null;
    }

  /* public Product update(String id, Product product){
        Product byId=getProductById(id);
        if(byId==null)
            return null;
        else{                  //correct
            int index=products.indexOf(byId);
            products.set(index,product);
        }

        }*/
        public Product update(String id, Product product){

        for(Product p:products){
            if(product.getId().equals(id)){
                Product newProduct = new Product();
                product.setName(newProduct.getName());
                product.setMaxRetailPrice((newProduct.getMaxRetailPrice()));
                product.setDiscountPercentage(newProduct.getDiscountPercentage());
                return product;
            }
        }
        return null;

    }
    public void delete(Product product){
        products.remove(product);}

    public void deleteById(String id){
            Product byId=getProductById(id);
            products.remove(byId);//correct
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
           for (Product p : products) {
               System.out.printf("%-8s | %-25s | ₹%-10.2f | %-7.2f%%\n",
                       p.getId(),
                       p.getName(),
                       p.getMaxRetailPrice(),
                       p.getDiscountPercentage());
           }
       }


    public void sortByPriceAscending(){
        for (int i = 0; i < products.size() - 1; i++) {

            for (int j = 0; j < products.size() - i - 1; j++) {

                if (products.get(j).getMaxRetailPrice() > products.get(j + 1).getMaxRetailPrice()) {

                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }


    public void sortByPriceDescending(){
      //  List<Product> sortedlist=new ArrayList<>();

        for (int i = 0; i < products.size() - 1; i++) {

            for (int j = 0; j < products.size() - i - 1; j++) {

                if (products.get(j).getMaxRetailPrice() < products.get(j + 1).getMaxRetailPrice()) {

                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
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

   /* public long countProductsAbovePrice(double price){
        return products.stream()
                .filter(product -> product.getMaxRetailPrice() > price).count();
    }*/
   public int countProductsAbovePrice(double price) {

       int count = 0;

       for (Product p : products) {
           if (p.getMaxRetailPrice() > price) {
               count++;
           }
       }

       return count;
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


