package com.communitymarketplace.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.communitymarketplace.model.Product;
import com.communitymarketplace.model.User;
import com.communitymarketplace.repository.ProductRepository;
import com.communitymarketplace.services.ProductServices;
@Service
public class ProductServiceImpl implements ProductServices {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product); // No need to manually set attributes
    }

    @Override
    public List<Product> getAllProducts() { // Renamed from 'getallProduct'
        return productRepository.findAll();
    }
}