package com.example.ProjectFit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {
    List<Workout> findWorkoutByType(String type);
    List<Workout> findWorkoutByDuration(int duration);
    List<Workout> findWorkoutByMuscle(List<String> muscle);
}
