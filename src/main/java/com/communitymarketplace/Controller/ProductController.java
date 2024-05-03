package com.communitymarketplace.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import com.communitymarketplace.model.Product;
import com.communitymarketplace.services.ProductServices;

public class ProductController {
    @Autowired
    private ProductServices productServices;

    @MutationMapping // Expose this method as a GraphQL mutation
    public Product createProduct(@Argument Product product) {
        return productServices.createProduct(product);
    }

    @QueryMapping // Expose this method as a GraphQL query
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }
}