package com.example.exam.spring.exam.model;

import com.example.exam.spring.exam.repo.QuizRepo;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuizQuestion implements QuizRepo {

  long id;
  List<IndividualQuestion> questions;

  public QuizQuestion(List<IndividualQuestion> questions) {
    this.questions = questions;
  }
}
