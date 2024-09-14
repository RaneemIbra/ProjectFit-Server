package com.example.ProjectFit.Repositories;

import com.example.ProjectFit.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmailAddress(String emailAddress);
}
