package com.example.movieapp.service;

import com.example.movieapp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movieList = new ArrayList<>();

    public Movie addMovie(Movie movie) {
        movieList.add(movie);
        return movie;
    }

    public Movie getMovieById(int id) {
        for (Movie movie : movieList) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}
