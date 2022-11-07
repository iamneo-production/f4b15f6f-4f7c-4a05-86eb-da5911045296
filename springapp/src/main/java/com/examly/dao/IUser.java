package com.examly.dao;
import com.examly.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User,Integer> {
    
}