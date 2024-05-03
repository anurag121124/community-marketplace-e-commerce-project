package com.communitymarketplace.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.communitymarketplace.model.Product;
import com.communitymarketplace.repository.ProductRepository;
import com.communitymarketplace.services.ProductServices;

@Service
public class ProductServiceImpl implements ProductServices {

    @Autowired
    private ProductRepository productRepository;

    @Override

    public Product createProduct(Product product) {
        product.setName(product.getName());
        product.setDescription(product.getDescription());
        product.setImage(product.getImage());
        product.setPrice(product.getPrice());
      return
      productRepository.save(product);
    }


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }




    
}
