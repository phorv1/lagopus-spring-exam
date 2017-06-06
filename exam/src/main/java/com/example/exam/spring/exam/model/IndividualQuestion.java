package com.example.exam.spring.exam.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class IndividualQuestion {

  long id;
  String question;
}
