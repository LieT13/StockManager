package com.lietsoft.stockmanager.products.repository;

import com.lietsoft.stockmanager.products.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsRepository {

    private static Map<String, Product> products = new HashMap<>();

    static {
        products.put("1000000001", new Product("1000000001", "Boligrafo BIC Azul", 10));
        products.put("1000000002", new Product("1000000002", "Boligrafo BIC Rojo", 10));
        products.put("1000000003", new Product("1000000003", "Cuaderno espiral", 5));
        products.put("1000000004", new Product("1000000004", "Cartulinas rojas", 20));
        products.put("1000000005", new Product("1000000005", "Cartulinas negras", 20));
    }

    public static List<Product> findAllProducts() {
        List<Product> productsList = new ArrayList<>();
        products.values().forEach(productsList::add);
        return productsList;
    }

    public static Product findProductByRef(String ref) {
        return products.get(ref);
    }

}
