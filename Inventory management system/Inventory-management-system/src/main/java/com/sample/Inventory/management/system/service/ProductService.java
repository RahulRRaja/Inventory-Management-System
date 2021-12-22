package com.sample.Inventory.management.system.service;

import com.sample.Inventory.management.system.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    Product getProduct(Integer id);

    Product editProduct(Product product);

    void deleteProduct(Product product);

    void deleteProduct(Integer id);

    List<Product> getAllProducts();

    long countProducts();
}
