package com.example.movieapp.controller;

import com.example.movieapp.model.Movie;
import com.example.movieapp.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Add a new movie
    @PostMapping
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {

        // Input Validation
        if (movie.getName() == null || movie.getName().isEmpty()) {
            return ResponseEntity.badRequest().body("Movie name is required");
        }

        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    // Get movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id) {
        Movie movie = movieService.getMovieById(id);

        if (movie == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(movie);
    }
}
