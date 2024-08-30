package com.example.ProjectFit.Repositories;

import com.example.ProjectFit.Entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
