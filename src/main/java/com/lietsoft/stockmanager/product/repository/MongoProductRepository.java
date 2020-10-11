package com.lietsoft.stockmanager.product.repository;

import com.lietsoft.stockmanager.product.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

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
