package com.jscode.spring.product;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void saveProduct(Product product) {
        this.products.add(product);
    }

    public void setId(int id){
    }

    // 전체 상품을 조회하는 메소드
    public List<Product> findAll() {
        return products;
    }

    // 특정 상품을 조회하는 메소드
    public Product findOne(String name) {
        //return products.get(id);
        //이름으로 입력받을때 상세조회
        for (Product product : this.products) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}