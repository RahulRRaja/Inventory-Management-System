package com.sample.Inventory.management.system.service.impl;

import com.sample.Inventory.management.system.entity.Product;
import com.sample.Inventory.management.system.repository.ProductRepository;
import com.sample.Inventory.management.system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product Product) {
        return productRepository.save(Product);
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.getOne(id);
    }

    @Override
    public Product editProduct(Product Product) {
        return productRepository.save(Product);
    }

    @Override
    public void deleteProduct(Product Product) {
        productRepository.delete(Product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "pid"));
    }

    @Override
    public long countProducts() {
        return productRepository.count();
    }

}
