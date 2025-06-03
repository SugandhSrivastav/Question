package com.question.Service;

import com.question.Entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> getAllQuestion();
    Question getQuestionById(Integer questionId);
    Question addQuestion(Question question);

//  For Question Client to implement feign
    List<Question> getQuizById(Integer quizId);

}
