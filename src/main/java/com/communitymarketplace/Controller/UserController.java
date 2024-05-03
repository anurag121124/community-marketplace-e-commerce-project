package com.communitymarketplace.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.communitymarketplace.model.User;
import com.communitymarketplace.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @MutationMapping("createUser")
    public User createUser(@Argument("user") User user) {
         return this.userService.createUser(user);
    }

    @QueryMapping("getUserById")
    public User getUserById(@Argument("id") int id) {
        return this.userService.getUserById(id);
    }

    // Method to convert UserInput to User
}
