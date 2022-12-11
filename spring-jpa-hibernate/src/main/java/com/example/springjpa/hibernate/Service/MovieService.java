package com.example.springjpa.hibernate.Service;

import com.example.springjpa.hibernate.Repository.MovieRepository;
import com.example.springjpa.hibernate.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movies> getAllMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movies movies){
        movieRepository.save(movies);
    }
}
