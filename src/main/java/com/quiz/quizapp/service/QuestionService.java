package com.quiz.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.dao.QuestionDao;
import com.quiz.quizapp.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions(){
		return questionDao.findAll();
	}
	
	public List<Question> getQuestionsByCategory(String category){
		return questionDao.findByCategory(category);
	}
	
	public String addQuestion(Question question) {
		questionDao.save(question);
		return "success";	
	}

}
