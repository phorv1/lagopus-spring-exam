package com.example.exam.spring.exam.model;

import org.springframework.stereotype.Component;

@Component
public class IndividualAnswere {

  long id;
  String answere;

  public IndividualAnswere(long id, String answere) {
    this.id = id;
    this.answere = answere;
  }

  public IndividualAnswere() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswere() {
    return answere;
  }

  public void setAnswere(String answere) {
    this.answere = answere;
  }
}
