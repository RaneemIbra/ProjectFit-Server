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
            user.setFullName(userDetails.getFullName());
            user.setPhoneNum(userDetails.getPhoneNum());
            user.setEmailAddress(userDetails.getEmailAddress());
            user.setPassword(userDetails.getPassword());
            user.setHeight(userDetails.getHeight());
            user.setWeight(userDetails.getWeight());
            user.setProfilePicture(userDetails.getProfilePicture());
            user.setAchievments(userDetails.getAchievments());
            user.setPlan(userDetails.getPlan());
            user.setWorkoutHistory(userDetails.getWorkoutHistory());
            user.setStepsHistory(userDetails.getStepsHistory());
            user.setWaterHistory(userDetails.getWaterHistory());

            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
