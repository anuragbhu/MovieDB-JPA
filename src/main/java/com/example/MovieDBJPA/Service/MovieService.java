package com.example.MovieDBJPA.Service;

import com.example.MovieDBJPA.Dto.MovieDto;
import com.example.MovieDBJPA.Model.Movie;
import com.example.MovieDBJPA.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String insertMovie(MovieDto movieDto) {
        Movie movieObj = new Movie(movieDto.getName(), movieDto.getTitle(),
                movieDto.getDate(), movieDto.getRating());
        movieRepository.save(movieObj);
        return "Saved!";
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
