package com.question.ServiceImpl;

import com.question.Entity.Question;
import com.question.Repository.QuestionRepository;
import com.question.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Integer questionId) {
        return questionRepository.findById(questionId).orElseThrow(()-> new RuntimeException("No Question Found!!"));
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuizById(Integer quizId) {
        return questionRepository.findByQuizId(quizId);
    }


}
