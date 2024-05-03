package com.communitymarketplace.services;

import java.util.List;

import com.communitymarketplace.model.Product;

public interface ProductServices {
    Product createProduct(Product product);
    List<Product>getAllProducts();

}
