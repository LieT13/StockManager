package com.lietsoft.stockmanager.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.lietsoft.stockmanager.domain.Product;

@Primary
@Profile("prod")
@Repository
public class MongoProductRepository implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findByRef(String ref) {
        return null;
    }

}
