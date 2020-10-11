package com.lietsoft.stockmanager.product.repository;

import com.lietsoft.stockmanager.product.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    Product findByRef(String ref);

}
