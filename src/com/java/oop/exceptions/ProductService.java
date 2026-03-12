package com.java.oop.exceptions;

public class ProductService {

   private final ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();

    }

    public Product save(Product product) throws ProductExistsException {
        if (productRepository.exists(product.getId())) {
            throw new ProductExistsException("Product already exists" + product.getId());

        }
        return productRepository.save(product);
    }


}
