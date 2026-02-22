package com.java.oop.strings.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class OrderRepository {

    //CRUD methods on Order
    HashSet<Order> orders ;

    public OrderRepository() {
        orders = new HashSet<>();
    }

    //create new order
    Order save(Order order){
        orders.add(order);
        return order;
    }

    //get all orders
    HashSet<Order> getAll(){
        return orders;
    }

    //get Order by Id
    Order getById(String id){
        System.out.println("id: " + id);
        /*Iterator<Order> iterator = orders.iterator();
        Order order = null;
        while(iterator.hasNext()){
            order = iterator.next();
            if(order.getId().equals(id))
             break;
        }*/
        Order orderById = null;
        for (Order order: orders){
            if (order.getId().equals(id))
                orderById = order;
        }
        return orderById;
    }

    Order update(Order order){
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            Order existingOrder = iterator.next();
            if (existingOrder.getId().equals(order.getId())){
                iterator.remove();
                break;
            }
        }
        orders.add(order);
        return order;
    }

    //delete by Id
    void delete(String id){
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            Order existingOrder = iterator.next();
            if (existingOrder.getId().equals(id)){
                iterator.remove();
                break;
            }
        }
    }
}
