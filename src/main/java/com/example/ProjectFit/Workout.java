package com.example.ProjectFit;

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
    @Lob
    @Column(name = "workout_image", columnDefinition = "BLOB")
    private byte[] workoutImage;
    @Lob
    @Column(name = "profile_icon", columnDefinition = "BLOB")
    private byte[] profileIcon;
    @Lob
    @Column(name = "workout_animation", columnDefinition = "BLOB")
    private byte[] workoutAnimation;
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

    public byte[] getWorkoutImage() {
        return workoutImage;
    }

    public void setWorkoutImage(byte[] workoutImage) {
        this.workoutImage = workoutImage;
    }

    public byte[] getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(byte[] profileIcon) {
        this.profileIcon = profileIcon;
    }

    public byte[] getWorkoutAnimation() {
        return workoutAnimation;
    }

    public void setWorkoutAnimation(byte[] workoutAnimation) {
        this.workoutAnimation = workoutAnimation;
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
