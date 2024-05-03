package com.communitymarketplace.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import com.communitymarketplace.model.Product;
import com.communitymarketplace.services.ProductServices;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @MutationMapping("createProduct")
    public Product createProduct(@Argument("product")  Product product) {
        return this.productServices.createProduct(product);
    }

    @QueryMapping
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }
}