package com.example.ProjectFit.Controllers;

import com.example.ProjectFit.Entities.User;
import com.example.ProjectFit.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public List<User> getAllUsers() {return userRepository.findAll();}
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (userDetails.getFullName() != null) {
                user.setFullName(userDetails.getFullName());
            }
            if (userDetails.getPhoneNum() != null) {
                user.setPhoneNum(userDetails.getPhoneNum());
            }
            if (userDetails.getEmailAddress() != null) {
                user.setEmailAddress(userDetails.getEmailAddress());
            }
            if (userDetails.getPassword() != null) {
                user.setPassword(userDetails.getPassword());
            }
            if (userDetails.getHeight() != 0) {
                user.setHeight(userDetails.getHeight());
            }
            if (userDetails.getWeight()!=0) {
                user.setWeight(userDetails.getWeight());
            }
            if (userDetails.getProfilePicture() != null) {
                user.setProfilePicture(userDetails.getProfilePicture());
            }
            if (userDetails.getAchievments() != null) {
                user.setAchievments(userDetails.getAchievments());
            }
            if (userDetails.getPlan() != null) {
                user.setPlan(userDetails.getPlan());
            }
            if (userDetails.getWorkoutHistory() != null) {
                user.setWorkoutHistory(userDetails.getWorkoutHistory());
            }
            if (userDetails.getStepsHistory() != null) {
                user.setStepsHistory(userDetails.getStepsHistory());
            }
            if (userDetails.getWaterHistory() != null) {
                user.setWaterHistory(userDetails.getWaterHistory());
            }

            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
