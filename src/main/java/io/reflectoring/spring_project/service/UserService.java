package io.reflectoring.spring_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.reflectoring.spring_project.entity.User;
import io.reflectoring.spring_project.repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {  // Constructor parameter name changed to match the field
        this.userRepo = userRepo;
    }

    // Method to save a new user
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // Method to fetch all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Method to fetch a user by their ID
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }
}
