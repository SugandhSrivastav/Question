package com.question.Controller;

import com.question.Entity.Question;
import com.question.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/{qId}")
    public Question getQuestionById(@PathVariable Integer qId){
        return questionService.getQuestionById(qId);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return this.questionService.addQuestion(question);
    }

}
