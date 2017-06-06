package com.example.exam.spring.exam.controller;

import com.example.exam.spring.exam.model.IndividualQuestion;
import com.example.exam.spring.exam.model.QuizQuestion;
import com.example.exam.spring.exam.repo.QuizRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {

  @Autowired
  QuizQuestion quizQuestion;
  @Autowired
  IndividualQuestion individualQuestions;

  @RequestMapping(value = "/questions")
  public QuizRepo getQuizQuestion(@RequestParam(value = "questions", required = true) List<IndividualQuestion> question) {
  return new QuizQuestion(question);

  }
}
