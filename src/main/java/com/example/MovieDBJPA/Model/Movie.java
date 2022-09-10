package com.example.MovieDBJPA.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "films")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    // GenerationType.AUTO -> Hibernate is responsible for assigning unique value to the attribute.
    //                     -> Also, two different tables will not have same id value like 1 exists
    //                        in one table then it will not exit in same as well as other table also.
//                         -> As we have only one hibernate_sequence (sequence in db) for all.
//                         -> Don't insert records from postgres console or any other means as
//                            id will not be updated in hibernate_sequence.
    // GenerationType.IDENTITY -> Postgres is responsible for assigning unique value to the attribute.
    private String name;
    private String title;
    private long date;
    @Column(name = "xyz")
    private int rating;

    public Movie(String name, String title, long date, int rating) {
        this.name = name;
        this.title = title;
        this.date = date;
        this.rating = rating;
    }

    public Movie() {
    }
}
