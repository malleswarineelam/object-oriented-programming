package com.java.oop.exceptions;

public class ProductController {
    private final ProductService productService;

    public ProductController(){
        this.productService=new ProductService();
    }

    public Product saveProduct(Product product) throws ProductExistsException{
        return productService.save(product);
    }
}
