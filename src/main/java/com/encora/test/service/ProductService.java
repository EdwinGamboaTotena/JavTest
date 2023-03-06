package com.encora.test.service;

import com.encora.test.model.Product;
import com.encora.test.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Collection<Product> getSomeProductsByIds(Collection<Integer> ids) {
        return null;
    }

    @Override
    public Collection<Product> getSomeProductsByBrand(String brand) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }
}
