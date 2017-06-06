package com.example.exam.spring.exam.model;

import org.springframework.stereotype.Component;

@Component
public class IndividualQuestion {

  long id;
  String question;

  public IndividualQuestion() {
  }

  public IndividualQuestion(long id, String question) {
    this.id = id;
    this.question = question;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
