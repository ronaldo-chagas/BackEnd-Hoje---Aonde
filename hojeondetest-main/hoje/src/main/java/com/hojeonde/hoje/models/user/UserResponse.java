package com.hojeonde.hoje.models.user;

public record UserResponse(String nome, String email) {
    public UserResponse(User user) {
        this(user.getNome(), user.getEmail());
    }
}
