package com.examly.dao;
import com.examly.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComments extends JpaRepository<Comments,Integer> {
    
}