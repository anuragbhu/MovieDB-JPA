package com.example.MovieDBJPA.Dto;

import com.example.MovieDBJPA.Model.Movie;

import java.util.List;

public class MovieResponseDto {
    List<Movie> movies;

    public MovieResponseDto(List<Movie> movies) {
        this.movies = movies;
    }
}
