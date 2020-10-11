package com.lietsoft.stockmanager.products.repository;

import com.lietsoft.stockmanager.products.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    Product findByRef(String ref);

}
