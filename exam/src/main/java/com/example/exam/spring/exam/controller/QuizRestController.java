package com.example.exam.spring.exam.controller;

import com.example.exam.spring.exam.model.IndividualQuestion;
import com.example.exam.spring.exam.model.QuizQuestion;
import com.example.exam.spring.exam.repo.QuizRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {

  @Autowired
  QuizQuestion quizQuestion;
  @Autowired
  IndividualQuestion individualQuestions;

  @GetMapping(value = "/questions")
  public QuizRepo getQuizQuestion(@RequestParam(value = "id") Long id,
          @RequestParam(value = "questions") List<IndividualQuestion> question) {

    return new QuizQuestion(question);

  }

  @PostMapping(value = "/answers")
  public QuizRepo receiveAnswerForQuestions() {

   return new QuizQuestion();
  }


}
