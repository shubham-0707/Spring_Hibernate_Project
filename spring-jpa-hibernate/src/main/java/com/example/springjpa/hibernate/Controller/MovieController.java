package com.example.springjpa.hibernate.Controller;

import com.example.springjpa.hibernate.Service.MovieService;
import com.example.springjpa.hibernate.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get_movies")
    public List<Movies> getMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping("/add_movie")
    public void addMovie(@RequestBody() Movies movie){
        movieService.addMovie(movie);
    }


}
