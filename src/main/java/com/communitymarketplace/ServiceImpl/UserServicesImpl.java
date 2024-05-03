package com.communitymarketplace.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.communitymarketplace.Response.UserResponse;
import com.communitymarketplace.model.User;
import com.communitymarketplace.repository.UserRepository;
import com.communitymarketplace.services.UserService;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        user.setName(user.getName());
        user.setUserEmail(user.getUserEmail());
        user.setPassword(user.getPassword());
        user.setUserPhone(user.getUserPhone());
        user.setAddress(user.getAddress());
        User savedUser = this.userRepository.save(user);
        return savedUser;  
    }
    
    @Override
    public User getUserById(int id) {
       return this.userRepository.findById(id).orElseThrow(()-> new RuntimeException("User is not found in the Server"));
    }
}
