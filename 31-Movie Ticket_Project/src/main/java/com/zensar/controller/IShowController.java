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
import com.zensar.bean.Show;
import com.zensar.service.IShowService;

@RestController
public class IShowController {

	@Autowired
	IShowService showService;

	@PostMapping(value = "/insertshow")
	public Show f1(@RequestBody Show show) 
	{
		return this.showService.addShow(show);
	}

	@PutMapping(value="/updateshow")
	public Show f2(@RequestBody Show show) 
	{
		return this.showService.updateShow(show);
	}

	@DeleteMapping(value="/deleteshow")
	public boolean f3(@RequestBody Show show) 
	{
		return this.showService.removeShow(show);
	}

	@GetMapping(value = "/getshow/{sid}")
	public Show f4(@PathVariable(name = "sid") int showId) 
	{
		return this.showService.viewShow(showId);
	}

	// GET All
	@GetMapping(value = "/getAllShows")
	public List<Show> f5() {
		return this.showService.viewAllShow();
	}

	// GET Movie List by theater id
	@GetMapping(value = "/getTheatreById/{tid}")
	public List<Show> f6(@PathVariable(name = "tid") int theatreId) 
	{
		return this.showService.viewMovieList(theatreId);
	}

	// GET Movie List by date
	@GetMapping(value = "/getDate/{d}")
	public List<Movie> f7(@PathVariable(name = "d") LocalDate date) 
	{
		return this.showService.viewMovieList(date);
	}

}