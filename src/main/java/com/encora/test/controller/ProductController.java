package com.encora.test.controller;

import com.encora.test.model.Product;
import com.encora.test.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v0/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public Collection<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("")
    public Collection<Product> getSomeProductsByIds(@RequestParam List<Integer> ids){
        return productService.getSomeProductsByIds(ids);
    }

    @GetMapping("/by-brand")
    public Collection<Product> getSomeProductsByBrand(@RequestParam String brand){
        return productService.getSomeProductsByBrand(brand);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }



    @PostMapping("")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
