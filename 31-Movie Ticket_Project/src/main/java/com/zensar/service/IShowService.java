package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Movie;
import com.zensar.bean.Show;
import com.zensar.db.IShowDAO;

@Service
public class IShowService {

	@Autowired
	IShowDAO showDao;

	// Add Show
	public Show addShow(Show show) 
	{
		return this.showDao.save(show);
	}

	// Update Show
	public Show updateShow(Show show) 
	{
		return this.showDao.save(show);
	}

	// Remove Show
	public boolean removeShow(Show show) 
	{
		showDao.delete(show);
		return true;
	}

	// View Show
	public Show viewShow(int showId) 
	{
		Optional<Show> optional = showDao.findById(showId);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	// View All Shows
	public List<Show> viewAllShow() 
	{
		return this.showDao.findAll();
	}

	// View Show List by theater id
	public List<Show> viewMovieList(int theatreId)
	{
		return null;
	}

	// View Movie List by dates
	public List<Movie> viewMovieList(LocalDate date) 
	{
		// return this.showDao.getAllBymovieDate(date);
		return null;
	}

}