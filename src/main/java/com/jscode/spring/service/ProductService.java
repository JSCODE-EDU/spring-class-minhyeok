package com.jscode.spring.service;

import com.jscode.spring.entity.ProductEntity;
import com.jscode.spring.product.Product;
import com.jscode.spring.repository.ProductJpaRepository;
import com.jscode.spring.repository.ProductRepository;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    private final ProductJpaRepository productJpaRepository;
    private final ProductRepository productRepository;

    public ProductService(ProductJpaRepository productJpaRepository,
        ProductRepository productRepository) {
        this.productJpaRepository = productJpaRepository;
        this.productRepository = productRepository;
    }

    public List<ProductEntity> findAll() {
        return productJpaRepository.findAll();
    }

    public Product findOneByName(String name) {
        return productRepository.findOneByName(name);
    }

    public Optional<ProductEntity> findOneById(Long id){
        return productJpaRepository.findById(id);
    }

    public void save(ProductEntity productEntity) {
        productJpaRepository.save(productEntity);
    }

}