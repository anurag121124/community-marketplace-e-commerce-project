package com.communitymarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.communitymarketplace.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

    
}
