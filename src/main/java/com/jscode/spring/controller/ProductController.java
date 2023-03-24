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

    //    @PostMapping("")
//    public void save(@RequestBody Product product){
//        productService.save(product);
//    }
    @PostMapping("")
    public String saveProduct(@RequestBody ProductEntity productEntity) {
        productService.save(productEntity);
        return "정상 저장됐습니다.";
    }

    @GetMapping(value = "", params = "name")
    public List<ProductEntity> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }

    @GetMapping(params = "id")
    public Optional<ProductEntity> findOneById(@RequestParam Long id) {
        return productService.findOneById(id);
    }
}