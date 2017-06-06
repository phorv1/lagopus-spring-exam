package com.example.exam.spring.exam.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QuizAnswere {

  long id;
  List<IndividualAnswere> answeres;

  public QuizAnswere(long id,
          List<IndividualAnswere> answeres) {
    this.id = id;
    this.answeres = answeres;
  }

  public QuizAnswere() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<IndividualAnswere> getAnsweres() {
    return answeres;
  }

  public void setAnsweres(List<IndividualAnswere> answeres) {
    this.answeres = answeres;
  }
}
