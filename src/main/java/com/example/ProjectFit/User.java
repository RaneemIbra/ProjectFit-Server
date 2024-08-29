package com.example.ProjectFit;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String fullName;
    Long phoneNum;
    String emailAddress;
    String password;
    LocalDate birthday;
    double height;
    double weight;
    boolean gender;
    String securityQuestion;
    String answer;
    @Lob
    @Column(name = "profile_picture", columnDefinition = "BLOB")
    private byte[] profilePicture;
    @ElementCollection
    List<Boolean> achievments;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private Map<Integer, Workout> plan = new HashMap<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private Map<Integer, Workout> workoutHistory = new HashMap<>();
    @ElementCollection
    private Map<LocalDate, Integer> stepsHistory = new HashMap<>();
    @ElementCollection
    private Map<LocalDate, Integer> waterHistory = new HashMap<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<Boolean> getAchievments() {
        return achievments;
    }

    public void setAchievments(List<Boolean> achievments) {
        this.achievments = achievments;
    }

    public Map<Integer, Workout> getPlan() {
        return plan;
    }

    public void setPlan(Map<Integer, Workout> plan) {
        this.plan = plan;
    }

    public Map<Integer, Workout> getWorkoutHistory() {
        return workoutHistory;
    }

    public void setWorkoutHistory(Map<Integer, Workout> workoutHistory) {
        this.workoutHistory = workoutHistory;
    }

    public Map<LocalDate, Integer> getStepsHistory() {
        return stepsHistory;
    }

    public void setStepsHistory(Map<LocalDate, Integer> stepsHistory) {
        this.stepsHistory = stepsHistory;
    }

    public Map<LocalDate, Integer> getWaterHistory() {
        return waterHistory;
    }

    public void setWaterHistory(Map<LocalDate, Integer> waterHistory) {
        this.waterHistory = waterHistory;
    }
}
