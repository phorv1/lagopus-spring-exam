package com.example.exam.spring.exam.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
public class QuizQuestion {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  List<IndividualQuestion> questions = new ArrayList<>();

  public QuizQuestion() {
  }

  public QuizQuestion(List<IndividualQuestion> questions) {
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<IndividualQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<IndividualQuestion> questions) {
    this.questions = questions;
  }
}
