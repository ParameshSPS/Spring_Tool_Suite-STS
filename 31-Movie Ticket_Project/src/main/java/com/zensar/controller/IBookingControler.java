package com.zensar.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.TicketBooking;
import com.zensar.service.IBookingService;

@RestController
public class IBookingControler {
	
	@Autowired
	IBookingService bookingService;

	@PostMapping(value = "/addBooking")
	public TicketBooking addf1(@RequestBody TicketBooking booking) 
	{
		return this.bookingService.addBooking(booking);
	}

	@PutMapping(value = "/updateBooking")
	public TicketBooking updatef2(@RequestBody TicketBooking booking) 
	{
		return this.bookingService.updateBooking(booking);
	}

	@DeleteMapping(value = "/deletebooking/{tid}")
	public TicketBooking deletef3(@PathVariable(name = "tid") int ticketId) 
	{
		return this.bookingService.cancelBooking(ticketId);
	}

	@GetMapping("/ShowAllbookings/{mid}")
	public Optional<TicketBooking> showAllBookingf4(@PathVariable(name = "mid") int movieId) 
	{
		return this.bookingService.showAllBooking(movieId);
	}

	@GetMapping("/ShowAllbookingsondate/{d}")
	public List<TicketBooking> showAllBookingf5(@PathVariable(name = "d") LocalDate date) 
	{	
		// return this.bookingDao.findAll(date);
		return null;
	}
	
	@GetMapping(value = "/getAllbookings")
	public List<TicketBooking> showBookingListf6() 
	{
		return this.bookingService.showBookingList();
	}
	
	@GetMapping("/ShowAllbookingsonshowid/{sid}")
	public Optional<TicketBooking> showBookingListf7(@PathVariable(name = "sid") int showId)
	{
		return this.bookingService.showBookingList(showId);
	}
	
}