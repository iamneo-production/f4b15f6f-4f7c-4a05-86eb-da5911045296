package com.examly.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.examly.dao.IUser;
import com.examly.model.User; 
import com.examly.dao.IMovie;
import com.examly.model.Movie; 
@RestController
public class AdminController {
    @Autowired
	IUser user;
	

    @GetMapping("/admin")
	public List<User> findAll() {
		return user.findAll();
        
	}
    @DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		user.deleteById(id);
		return "User Deleted ";
	}
    @PutMapping("/admin/userEdit/{id}")
	public String update(@RequestBody User u, @PathVariable("id") int id) {
		user.findById(u.getId()).map(us -> {
			us.setId(u.getId());
			us.setEmail(u.getEmail());
            us.setPassword(u.getPassword());
            us.setUsername(u.getUsername());
			us.setMobileNumber(u.getMobileNumber());
            us.setActive(u.isActive());
            us.setRole(u.getRole());
			return user.save(us);
		});
		return "Sava the changes";
	}

	
    
}