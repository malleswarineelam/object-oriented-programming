package com.java.oop.collections.map;

import com.java.oop.strings.assignment.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
//same for hashtable,linkedhashmap,treemap but in treemap it implements comparable in case of objects like
// <customerId,List<orders> etc
public class ProductHashMap {
    public static void main(String[] args) {
        //creation of hashmap using new
        HashMap<String, Product> productHashMap=new HashMap<>();

        //adding new elements using put() method
        productHashMap.put("p-101",new Product("p-101","Lenovo laptop",64000,1.1F));
        productHashMap.put("p-102",new Product("p-102","Dell laptop",55000,2.2F));
        productHashMap.put("p-103",new Product("p-103","Hp laptop",67000,3.3F));
        System.out.println(productHashMap);

        //Retrieval of keys from the map
        //we use keyset for  to get all keys ------ set of keys
        System.out.println("************************************************************");
        Set<String> keys=productHashMap.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        //Retrieval of values from the map
        //1.we use get() method to get value based on a key
        System.out.println("************************************************************");
        System.out.println(productHashMap.get("p-101"));
        System.out.println();

        //2.we use values() to get all values from map ------ collection of values
        System.out.println("************************************************************");
        System.out.println();
        Collection<Product> values=productHashMap.values();
        for(Product value:values){
            System.out.println(value);
        }

        //delection of elements from map --------- we use remove()
        //2 variations remove by key ,remove by key,value
        System.out.println("************************************************************");
        System.out.println();
        System.out.println(productHashMap);
        productHashMap.remove("p-103");
        System.out.println(productHashMap);

        //verification of keys in the map -------- we use contains it returns true or false
        System.out.println();
        System.out.println(productHashMap.containsKey("p-101"));
        System.out.println(productHashMap.containsKey("p-104"));

        //verification of values in the map -------- we use contains it returns true or false
        /*System.out.println();
        System.out.println(productHashMap.containsValue(""));
        System.out.println(productHashMap.containsValue(p-101));*/

        //updation is done in map directly by changing,replace() method also
        System.out.println(productHashMap);
        productHashMap.put("p-103",new Product("p-104","Apple laptop",86000,4.4F));
        System.out.println(productHashMap);




    }
}
