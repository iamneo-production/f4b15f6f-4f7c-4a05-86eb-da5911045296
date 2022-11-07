package com.examly.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.dao.ILikeModel;
import com.examly.model.LikeModel;
@RestController
public class UserLikeModelController {
    @Autowired
	ILikeModel like;
    @PostMapping("/like")
	public String add(@RequestBody LikeModel li) {
        like.saveAndFlush(li);
            return "like added to User";
	}
    @DeleteMapping("/like/{id}")
	public String delete(@PathVariable("id")int id) {
		like.deleteById(id);
		return "Like removed";
	}
}
