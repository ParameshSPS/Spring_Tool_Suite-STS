package com.zensar.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Movie;
import com.zensar.service.IMovieService;

@RestController
public class IMovieController {

	@Autowired
	IMovieService movieService;

	// ADD Movie
	@PostMapping(value = "/addMovie")
	public Movie add(@RequestBody Movie movie) {
		return this.movieService.addMovie(movie);
	}

	// UPDATE Movie
	@PutMapping(value = "/updateMovie")
	public Movie update(@RequestBody Movie movie) {
		return this.movieService.updateMovie(movie);
	}

	// DELETE Movie

	@DeleteMapping(value = "/deleteMovie/{mid}")
	public boolean delete(@PathVariable(name = "mid") int movieid) {
		return this.movieService.removeMovie(movieid);
	}

	// GET Movie By Id
	@GetMapping(value = "/get/{mid}")
	public Movie read1(@PathVariable(name = "mid") int movieId) {
		return this.movieService.viewMovie(movieId);
	}

	// GET All
	@GetMapping(value = "/getMovies")
	public List<Movie> read2() {
		return this.movieService.viewMovieList();
	}

	// GET Movie List by theater id
	@GetMapping(value = "/getTheatre/{tid}")
	public List<Movie> read3(@PathVariable(name = "tid") int theatreid) {
		return this.movieService.viewMovieList(theatreid);
	}

	// GET Movie List by date
	@GetMapping(value = "/getMoviesonDate/{d}")
	public List<Movie> read4(@PathVariable(name = "d") LocalDate date) {
		return this.movieService.viewMovieList(date);
	}

}