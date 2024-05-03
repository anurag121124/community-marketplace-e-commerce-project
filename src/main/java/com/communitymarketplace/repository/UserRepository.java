package com.communitymarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.communitymarketplace.model.User;

public interface UserRepository extends JpaRepository<User ,Integer> {


}
