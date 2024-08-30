package com.example.ProjectFit.Repositories;

import com.example.ProjectFit.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
