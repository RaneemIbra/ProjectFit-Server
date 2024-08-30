package com.example.ProjectFit.Controllers;

import com.example.ProjectFit.Entities.Question;
import com.example.ProjectFit.Repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;
    @GetMapping
    List<Question> getAllQuestions(){return questionRepository.findAll();}
}
