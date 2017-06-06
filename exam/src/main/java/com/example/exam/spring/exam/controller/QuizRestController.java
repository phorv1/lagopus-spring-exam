package com.example.exam.spring.exam.controller;

import com.example.exam.spring.exam.model.IndividualAnswere;
import com.example.exam.spring.exam.model.IndividualQuestion;
import com.example.exam.spring.exam.model.QuizQuestion;
import com.example.exam.spring.exam.model.QuizAnswere;
import com.example.exam.spring.exam.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
  @Autowired
  IndividualAnswere individualAnswere;

  RestTemplate restTemplate = new RestTemplate();
  String url = "https://springexamserver.herokuapp.com/projects/clasName";
  //restTemplate.postForObject(url, json, JsonReceived.class);



  @GetMapping(value = "/questions")
  public Iterable<QuizQuestion> getRandomQuestions() {
    return quizRepo.findAll();
  }

  @PostMapping(value = "/answeres")
  public QuizRepo receiveAnsweres(@RequestBody QuizAnswere quizAnswere) {
    quizRepo.findAll();
    return quizRepo;
  }

}
