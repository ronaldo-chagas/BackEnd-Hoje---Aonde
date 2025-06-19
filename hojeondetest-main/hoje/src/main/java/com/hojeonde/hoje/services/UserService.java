package com.hojeonde.hoje.services;

import com.hojeonde.hoje.models.user.User;
import com.hojeonde.hoje.models.user.UserRequest;
import com.hojeonde.hoje.models.user.UserResponse;
import com.hojeonde.hoje.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse save(UserRequest userRequest) {
        User user = userRequest.toUser();
        user = userRepository.save(user);
        return new UserResponse(user);
    }

    public UserResponse findById(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return new UserResponse(user);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
