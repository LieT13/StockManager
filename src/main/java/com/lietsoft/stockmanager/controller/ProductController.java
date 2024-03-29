package com.lietsoft.stockmanager.controller;

import com.lietsoft.stockmanager.domain.Product;
import com.lietsoft.stockmanager.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productsService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {
        return this.productsService.findAllProducts();
    }

    @RequestMapping(value = "/{ref}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductByRef(@PathVariable String  ref) {
        return this.productsService.findProductByRef(ref);
    }

}
