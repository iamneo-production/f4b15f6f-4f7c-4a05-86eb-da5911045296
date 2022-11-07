package com.examly.dao;
import com.examly.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovie extends JpaRepository<Movie,Integer> {
    
}