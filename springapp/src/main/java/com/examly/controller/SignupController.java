package com.examly.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.dao.IUser;
import com.examly.model.User;

@RestController
public class SignupController {
    @Autowired
    IUser user;
    @PostMapping("/signup")
	public boolean add(@RequestBody User u) {
        user.saveAndFlush(u);
            return true;
	}
}
