package com.communitymarketplace.services;

import com.communitymarketplace.model.User;

public interface UserService {
  
   User createUser(User user);
   User  getUserById(int id);
}
