package com.jscode.spring.controller;

import com.jscode.spring.entity.ProductEntity;
import com.jscode.spring.product.Product;
import com.jscode.spring.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public List<ProductEntity> findAll() {
        return productService.findAll();
    }

    @PostMapping("")
    public String saveProduct(@RequestBody ProductEntity productEntity) {
        productService.save(productEntity);
        return "정상 저장됐습니다.";
    }

    @GetMapping(params = "id")
    public Optional<ProductEntity> findOneById(@RequestParam Long id) {
        return productService.findOneById(id);
    }

    @GetMapping(value = "", params = "name")
    public List<ProductEntity> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }

    @GetMapping(params = "price")
    public List<ProductEntity> findByPriceOrderByNameDesc(@RequestParam Long price) {
        return productService.findByPriceOrderByNameDesc(price);
    }

    @GetMapping(params= {"name","price"})
    public List<ProductEntity> findByNameAndPrice(@RequestParam String name,@RequestParam Long price) {
        return productService.findByNameAndPrice(name, price);
    }
}