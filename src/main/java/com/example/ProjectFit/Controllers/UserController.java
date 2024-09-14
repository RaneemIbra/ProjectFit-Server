package com.example.ProjectFit.Controllers;

import com.example.ProjectFit.Entities.User;
import com.example.ProjectFit.Entities.Workout;
import com.example.ProjectFit.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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
            System.out.println("Found user with ID: " + id);

            if (userDetails.getPassword() != null && !userDetails.getPassword().isEmpty()) {
                user.setPassword(userDetails.getPassword());
                System.out.println("Password updated to: " + userDetails.getPassword());
            }

            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            System.out.println("User not found with ID: " + id);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/email/{emailAddress}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String emailAddress) {
        Optional<User> userOptional = userRepository.findByEmailAddress(emailAddress);

        if (userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/plan")
    public ResponseEntity<User> updatePlan(@PathVariable Long id, @RequestBody String plan) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setPlan(plan);
            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
