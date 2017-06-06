package com.example.exam.spring.exam.repo;


import com.example.exam.spring.exam.model.QuizQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuizRepo extends CrudRepository<QuizQuestion, Long> {

}
