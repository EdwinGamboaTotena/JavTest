package com.encora.test.repository;

import com.encora.test.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ProductRepository implements IProductRepository {

    private static List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        var laptop1 = new Product(1,"Laptop","Asus" ,1500.0);
        var laptop2 = new Product(2,"Laptop","Acer" ,1000.0);
        var laptop3 = new Product(3,"Laptop","Mac" ,2000.0);

        var cpu1 = new Product(4,"Core I7","Intel" ,1000.0);
        var cpu2 = new Product(5,"Core I5","Intel" ,9000.0);
        var cpu3 = new Product(6,"Amd A7","AMD" ,9000.0);

        products.add(laptop1);
        products.add(laptop2);
        products.add(laptop3);
        products.add(cpu1);
        products.add(cpu2);
        products.add(cpu3);
    }

    @Override
    public Collection<Product> getAllProducts() {
        return products;
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
