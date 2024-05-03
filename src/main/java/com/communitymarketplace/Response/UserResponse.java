package com.communitymarketplace.Response;

import com.communitymarketplace.model.User;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserResponse {
    private User user;
    private String message;

    // Constructors, getters, and setters
}