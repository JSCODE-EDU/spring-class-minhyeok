package com.jscode.spring.product;

import lombok.Getter;

@Getter
public class Product {

    private final String name;
    private final Long price;

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Long getPrice() {
        return this.price;
    }

}