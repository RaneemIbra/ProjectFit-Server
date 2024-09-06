package com.example.ProjectFit.Controllers;

import com.example.ProjectFit.Entities.Workout;
import com.example.ProjectFit.Repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        if (workout.getWorkoutImage() != null && !workout.getWorkoutImage().isEmpty()) {
            System.out.println("Workout Image received: " + workout.getWorkoutImage());
        }
        return workoutRepository.save(workout);
    }

    @GetMapping("/search/byType")
    public List<Workout> getWorkoutByType(@RequestParam String type) {
        return workoutRepository.findWorkoutsByWorkoutType(type);
    }

    @GetMapping("/search/byDuration")
    public List<Workout> getWorkoutByDuration(@RequestParam int duration) {
        return workoutRepository.findWorkoutsByDurationInMinutes(duration);
    }

    @GetMapping("/search/byMuscles")
    public List<Workout> getWorkoutByMuscle(@RequestParam List<String> muscles) {
        return workoutRepository.findWorkoutsByMusclesIn(muscles);
    }
    @GetMapping("/search/byDifficulty")
    public List<Workout> getWorkoutByDifficulty(@RequestParam int difficulty) {
        return workoutRepository.findWorkoutsByDifficulty(difficulty);
    }
}
