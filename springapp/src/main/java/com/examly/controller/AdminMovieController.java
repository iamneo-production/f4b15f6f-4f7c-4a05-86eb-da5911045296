package com.examly.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.examly.dao.IMovie;
import com.examly.model.Movie; 
@RestController
public class AdminMovieController {
    @Autowired
	IMovie movie;
    
    @GetMapping("/admin/movie")
	public List<Movie> findAll() {
		return movie.findAll();
        
	}
    @DeleteMapping("/admin/movie/{movieId}")
	public String delete(@PathVariable("movieId") int movieId) {
		movie.deleteById(movieId);
		return "Movie Deleted ";
	}
    @PutMapping("/admin/movie/{movieId}")
	public String update(@RequestBody Movie m, @PathVariable("movieId") int movieId) {
		movie.findById(movieId).map(mo -> {
			mo.setMovieName(m.getMovieName());
            mo.setMovieUrl(m.getMovieUrl());
            mo.setMoviePosterUrl(m.getMoviePosterUrl());
			mo.setMovieCast(m.getMovieCast());
            mo.setLikes(m.getLikes());
			return movie.save(mo);
		});
		return "Sava the changes";
	}
	
}
