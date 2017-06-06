package com.example.exam.spring.exam.controller;

import com.example.exam.spring.exam.model.IndividualQuestion;
import com.example.exam.spring.exam.model.QuizQuestion;
import com.example.exam.spring.exam.repo.QuizRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {

  @Autowired
  IndividualQuestion individualQuestion;
  @Autowired
  QuizQuestion quizQuestion;

  @GetMapping(value = "/questions")
  public QuizQuestion getRandomQuestions(@RequestParam("id") Long id,
          @RequestParam(value = "questions") String question) {
    List<IndividualQuestion> listOfQuestions = new ArrayList<>();
    individualQuestion.setId(id);
    individualQuestion.setQuestion(question);
    listOfQuestions.add(individualQuestion);
    quizQuestion.setQuestions(listOfQuestions);
    return quizQuestion;
  }
}
