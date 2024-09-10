package com.example.ProjectFit.Repositories;

import com.example.ProjectFit.Entities.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    List<Workout> findWorkoutsByWorkoutType(String workoutType);

    List<Workout> findWorkoutsByDurationInMinutes(int durationInMinutes);

    List<Workout> findWorkoutsByMusclesIn(List<String> muscles);
    List<Workout> findWorkoutsByDifficulty(int difficulty);
}
