package com.lietsoft.stockmanager.product.model;

public class Product {

    private String ref;
    private String description;
    private long stock;

    public Product(String ref, String description, long stock) {
        this.ref = ref;
        this.description = description;
        this.stock = stock;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

}
