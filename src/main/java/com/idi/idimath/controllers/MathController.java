package com.idi.idimath.controllers;

import com.idi.common.model.Question;
import com.idi.idimath.services.MathQuestionGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
public class MathController {

    @Autowired
    private MathQuestionGenerator mathQuestionGenerator;

    @GetMapping("/api/questions/random")
    public List<Question> getRandomQuestions(@RequestParam int amount) {
        return mathQuestionGenerator.getRandomQuestions(amount);
    }
}
