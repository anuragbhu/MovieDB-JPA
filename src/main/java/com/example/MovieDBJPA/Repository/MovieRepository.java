package com.example.MovieDBJPA.Repository;

import com.example.MovieDBJPA.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // Standard practice to use interface not class

    // <T, ID>
    // T -> Model for which we have this repository
    // ID -> Data type of the primary Key of that model
}
