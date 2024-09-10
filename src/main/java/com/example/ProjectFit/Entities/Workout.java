package com.example.ProjectFit.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "workouts")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String workoutName;
    int durationInMinutes;
    String workoutType;
    String workoutDescription;
    int difficulty;
    @ElementCollection
    List<String> muscles;

    int workoutImageResId;
    int workoutLogoResId;
    int workoutGifResId;
    int calories;
    @ElementCollection
    List<Integer> sets_reps;

    public Long getId() {
        return id;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<String> getMuscles() {
        return muscles;
    }

    public void setMuscles(List<String> muscles) {
        this.muscles = muscles;
    }

    public int getWorkoutLogoID() {
        return workoutLogoResId;
    }

    public int getWorkoutGif() {
        return workoutGifResId;
    }

    public void setWorkoutGif(int workoutGif) {
        this.workoutGifResId = workoutGif;
    }

    public void setWorkoutLogoID(int workoutLogoID) {
        this.workoutLogoResId = workoutLogoID;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public String getWorkoutDescription() {
        return workoutDescription;
    }

    public void setWorkoutDescription(String workoutDescription) {
        this.workoutDescription = workoutDescription;
    }

    public int getWorkoutImageID() {
        return workoutImageResId;
    }

    public void setWorkoutImageID(int workoutImageID) {
        this.workoutImageResId = workoutImageID;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Integer> getSets_reps() {
        return sets_reps;
    }

    public void setSets_reps(List<Integer> sets_reps) {
        this.sets_reps = sets_reps;
    }
}
