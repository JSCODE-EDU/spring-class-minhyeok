package com.jscode.spring.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findOne(String name) {
        return productRepository.findOne(name);
    }
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

}