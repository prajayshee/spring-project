package io.reflectoring.spring_project.repository;

import io.reflectoring.spring_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    // JpaRepository provides basic CRUD operations, including save, findById, findAll, etc.
}
