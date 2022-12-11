package com.example.springjpa.hibernate.Repository;


import com.example.springjpa.hibernate.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies, String>{
}
