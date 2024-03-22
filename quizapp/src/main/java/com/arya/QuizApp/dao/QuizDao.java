package com.arya.QuizApp.dao;

import com.arya.QuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;
import java.util.Optional;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    Optional<Quiz> findAllById(Integer id);

}
