package com.example.ProjectFit.Controllers;

import com.example.ProjectFit.Entities.Question;
import com.example.ProjectFit.Entities.User;
import com.example.ProjectFit.Repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;
    @GetMapping
    List<Question> getAllQuestions(){return questionRepository.findAll();}
    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return questionRepository.save(question);
    }
}
