package com.example.ProjectFit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutRepository workoutRepository;
    @GetMapping
    public List<Workout> getAllWorkouts() {return workoutRepository.findAll();}
    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout){
        return workoutRepository.save(workout);
    }
    @GetMapping("/search/byType")
    public Workout getWorkoutByType(@RequestParam String type) {
        return workoutRepository.findWorkoutByType(type);
    }
    @GetMapping("/search/byDuration")
    public Workout getWorkoutByDuration(@RequestParam int duration) {
        return workoutRepository.findWorkoutByDuration(duration);
    }
    @GetMapping("/search/byMuscles")
    public Workout getWorkoutByMuscle(@RequestParam List<String> muscles) {
        return workoutRepository.findWorkoutByMuscle(muscles);
    }
}
