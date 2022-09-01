package com.example.MovieDBJPA.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MovieDto {
    private String name;
    private String title;
    private long date;
    private int rating;
}
