package com.example.ProjectFit.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    List<Boolean> achievements;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> sundayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> mondayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> tuesdayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> wednesdayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> thursdayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> fridayList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Workout> saturdayList;
    boolean buildPlan;
    @ElementCollection
    List<String> answers;
    String plan;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private Map<Integer, Workout> workoutHistory;
    @ElementCollection
    private Map<LocalDate, Integer> stepsHistory;
    @ElementCollection
    private Map<LocalDate, Integer> waterHistory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Workout> getSundayList() {
        return sundayList;
    }

    public void setSundayList(List<Workout> sundayList) {
        this.sundayList = sundayList;
    }

    public List<Workout> getMondayList() {
        return mondayList;
    }

    public void setMondayList(List<Workout> mondayList) {
        this.mondayList = mondayList;
    }

    public List<Workout> getTuesdayList() {
        return tuesdayList;
    }

    public void setTuesdayList(List<Workout> tuesdayList) {
        this.tuesdayList = tuesdayList;
    }

    public List<Workout> getWednesdayList() {
        return wednesdayList;
    }

    public void setWednesdayList(List<Workout> wednesdayList) {
        this.wednesdayList = wednesdayList;
    }

    public List<Workout> getThursdayList() {
        return thursdayList;
    }

    public void setThursdayList(List<Workout> thursdayList) {
        this.thursdayList = thursdayList;
    }

    public List<Workout> getFridayList() {
        return fridayList;
    }

    public void setFridayList(List<Workout> fridayList) {
        this.fridayList = fridayList;
    }

    public List<Workout> getSaturdayList() {
        return saturdayList;
    }

    public void setSaturdayList(List<Workout> saturdayList) {
        this.saturdayList = saturdayList;
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

    public List<Boolean> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Boolean> achievements) {
        this.achievements = achievements;
    }

    public boolean isBuildPlan() {
        return buildPlan;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public void setBuildPlan(boolean buildPlan) {
        this.buildPlan = buildPlan;
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
        return achievements;
    }

    public void setAchievments(List<Boolean> achievments) {
        this.achievements = achievments;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
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
