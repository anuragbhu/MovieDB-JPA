package com.example.MovieDBJPA.Controller;

import com.example.MovieDBJPA.Dto.MovieDto;
import com.example.MovieDBJPA.Dto.MovieResponseDto;
import com.example.MovieDBJPA.Dto.ResponseDto;
import com.example.MovieDBJPA.Model.Movie;
import com.example.MovieDBJPA.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/insertMovie")
    public ResponseDto<String> insertMovie(@RequestBody MovieDto movieDto) {
        String res = movieService.insertMovie(movieDto);
        return new ResponseDto<>(res, HttpStatus.OK);
    }

    @GetMapping("/getAllMovies")
    public ResponseDto<List<MovieResponseDto>> getAllMovies() {
        List<Movie> movieList = movieService.getMovies();
        return new ResponseDto<>((List<MovieResponseDto>) new MovieResponseDto(movieList), HttpStatus.OK);
    }
}
