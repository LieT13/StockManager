package com.lietsoft.stockmanager.product.repository;

import com.lietsoft.stockmanager.product.model.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Profile("local")
@Repository
public class StaticProductRepository implements ProductRepository {

    private final Map<String, Product> products = new HashMap<>();

    public StaticProductRepository() {
        this.products.put("1000000001", new Product("1000000001", "Boligrafo BIC Azul", 10));
        this.products.put("1000000002", new Product("1000000002", "Boligrafo BIC Rojo", 10));
        this.products.put("1000000003", new Product("1000000003", "Cuaderno espiral", 5));
        this.products.put("1000000004", new Product("1000000004", "Cartulinas rojas", 20));
        this.products.put("1000000005", new Product("1000000005", "Cartulinas negras", 20));
    }

    public List<Product> findAll() {
        return new ArrayList<>(this.products.values());
    }

    public Product findByRef(String ref) {
        return this.products.get(ref);
    }

}
