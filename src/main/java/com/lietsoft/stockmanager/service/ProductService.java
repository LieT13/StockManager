package com.lietsoft.stockmanager.service;

import com.lietsoft.stockmanager.domain.Product;
import com.lietsoft.stockmanager.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productsRepository;

    public List<Product> findAllProducts() {
        return this.productsRepository.findAll();
    }

    public Product findProductByRef(String ref) {
        return this.productsRepository.findByRef(ref);
    }

}
