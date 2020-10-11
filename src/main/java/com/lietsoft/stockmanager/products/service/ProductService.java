package com.lietsoft.stockmanager.products.service;

import com.lietsoft.stockmanager.products.model.Product;
import com.lietsoft.stockmanager.products.repository.ProductRepository;
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
