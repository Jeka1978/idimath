package com.idi.idimath.services;

import com.idi.common.model.Question;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
@RefreshScope
public class MathQuestionGenerator  {

    @Value("${math.max}")
    private int max;

    @PostConstruct
    public void init(){
        System.out.println();
    }


    public Question getRandomQuestion() {
        Random random = new Random();
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        int answer = a+b;
        return Question.builder().question(a+" + "+b+" =?").answer(String.valueOf(answer)).build();
    }

    public List<Question> getRandomQuestions(int amount) {
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            questions.add(getRandomQuestion());

        }
        return questions;
    }
}



