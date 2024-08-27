package com.Question.question.controller;

import com.Question.question.model.Question;
import com.Question.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionsBYCategory(@PathVariable String category)
    {
       return questionService.getQuestionsBYCategory(category);
    }
   @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }
    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question)
    {
        return questionService.updateQuestion(question);
    }
    @DeleteMapping("delete")
    public String deleteQuestion(@RequestBody Question question)
    {
        return questionService.deleteQuestion(question);
    }
}
