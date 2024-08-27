package com.Question.question.service;

import com.Question.question.model.Question;
import com.Question.question.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
      return questionDao.findAll();
    }
    public List<Question> getQuestionsBYCategory(String category)
    {
        return questionDao.findByCategory(category);
    }
    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Inserted successfully";
    }

    public String updateQuestion(Question question) {
        questionDao.save(question);
        return "Updated successfully";
    }

    public String deleteQuestion(Question question) {
        questionDao.delete(question);
        return "Deleted successfully";
    }
}
