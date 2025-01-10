package com.example.question_service.dao;

import com.example.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    // Not working because of case sensitivity
    // public List<Question> findByCategory(String category);

    @Query(value = "select * from question where LOWER(category) = LOWER(:category)", nativeQuery = true)
    public List<Question> findByCategory(@Param("category") String category);

    @Query(value = "SELECT q.id FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);

}