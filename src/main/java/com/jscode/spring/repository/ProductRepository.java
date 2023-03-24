package com.jscode.spring.repository;

import com.jscode.spring.product.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("컴퓨터", 3000L));
        products.add(new Product("키보드", 2000L));
        products.add(new Product("마우스", 1000L));
    }

    public void saveProduct(Product product) {
        this.products.add(product);
    }

    // 전체 상품을 조회하는 메소드
    public List<Product> findAll() {
        return products;
    }

    // 특정 상품을 조회하는 메소드
    public Product findOneByName(String name) {
        //return products.get(id);
        //이름으로 입력받을때 상세조회
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}