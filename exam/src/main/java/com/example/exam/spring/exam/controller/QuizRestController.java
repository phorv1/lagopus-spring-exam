package com.example.exam.spring.exam.controller;

import com.example.exam.spring.exam.model.IndividualQuestion;
import com.example.exam.spring.exam.model.QuizQuestion;
import com.example.exam.spring.exam.model.QuizAnswere;
import com.example.exam.spring.exam.repo.QuizRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {

  @Autowired
  QuizRepo quizRepo;
  @Autowired
  IndividualQuestion individualQuestion;
  @Autowired
  QuizQuestion quizQuestion;
  @Autowired
  QuizAnswere quizAnswere;

  @GetMapping(value = "/questions")
  public QuizRepo getRandomQuestions(@RequestParam("id") Long id,
          @RequestParam(value = "questions") String question) {
    List<IndividualQuestion> listOfQuestions = new ArrayList<>();
    individualQuestion.setId(id);
    individualQuestion.setQuestion(question);
    listOfQuestions.add(individualQuestion);
    quizQuestion.setQuestions(listOfQuestions);
    quizRepo.save(quizQuestion);
    return quizRepo;
  }

  @PostMapping(value = "/answeres")
  public QuizRepo receiveAnsweres(){
    return quizRepo;
  }

}
