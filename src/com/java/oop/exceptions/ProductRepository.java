package com.java.oop.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List <Product> products;

    public ProductRepository(){
        products = new ArrayList<>();
    }
    public Product save(Product product){
        products.add(product);
        return product;
    }

   public Product getById(String id) {
       for (Product product : products) {
           if (product.getId().equals(id)) {
               return product;
           }
       }
       return null;
   }
   public Product update(String id,Product product){
        Product byId=getById(id);
        if(byId==null)
            return null;
        else{
            int index=products.indexOf(byId);
            products.set(index,product);
        }
        return product;

   }
   public void delete(Product product){
        products.remove(product);
    }
   public void deleteById(String id){
        Product byId=getById(id);
        products.remove(byId);
   }

   public boolean exists(String id){
        boolean exists=false;
        if(getById(id)!=null){
            exists=true;
        }
        return exists;
    }



}
