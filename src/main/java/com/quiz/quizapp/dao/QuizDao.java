package com.quiz.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
	
}
