package com.jscode.spring.product;

import java.util.List;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @GetMapping("")
    public List<Product> findAll() {
        return productService.findAll();
    }

    //@GetMapping(params = "id")
    @GetMapping(value = "", params = "name")
    public Product findOne(@RequestParam String name) {
        return productService.findOne(name);
    }
}