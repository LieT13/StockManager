package com.lietsoft.stockmanager.products.controller;

import com.lietsoft.stockmanager.products.repository.ProductsRepository;
import com.lietsoft.stockmanager.products.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductsController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {
        return ProductsRepository.findAllProducts();
    }

    @RequestMapping(value = "/{ref}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductByRef(@PathVariable String  ref) {
        return ProductsRepository.findProductByRef(ref);
    }

}
