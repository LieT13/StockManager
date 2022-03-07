package com.lietsoft.stockmanager.repository;

import java.util.List;

import com.lietsoft.stockmanager.domain.Product;

public interface ProductRepository {

    List<Product> findAll();
    Product findByRef(String ref);

}
