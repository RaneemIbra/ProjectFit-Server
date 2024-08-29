package com.example.ProjectFit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {
    Workout findWorkoutByType(String type);
    Workout findWorkoutByDuration(int duration);
    Workout findWorkoutByMuscle(String muscle);
}
