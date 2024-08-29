package com.example.ProjectFit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    // Find by workout type
    List<Workout> findWorkoutsByWorkoutType(String workoutType);

    // Find by duration in minutes
    List<Workout> findWorkoutsByDurationInMinutes(int durationInMinutes);

    // Find by muscles involved (using 'In' keyword to check any match in the list)
    List<Workout> findWorkoutsByMusclesIn(List<String> muscles);
}
