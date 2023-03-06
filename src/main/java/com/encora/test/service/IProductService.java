package com.encora.test.service;

import com.encora.test.model.Product;

import java.util.Collection;

public interface IProductService {
    public Collection<Product> getAllProducts();
    public Product getProductById(int id);
    public Collection<Product> getSomeProductsByIds(Collection<Integer> ids);
    public Collection<Product> getSomeProductsByBrand(String brand);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
}
