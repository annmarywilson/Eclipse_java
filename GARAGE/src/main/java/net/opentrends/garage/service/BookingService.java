package net.opentrends.garage.service;

import java.util.List;

import net.opentrends.garage.dto.BookingDTO;

public interface BookingService {
	public List listAll();
	public BookingDTO save(BookingDTO bookingDto);
	public void delete(BookingDTO bookingDto);
	public BookingDTO findByKey(int id);
	public BookingDTO setDates(BookingDTO bookingDto);
	public int findAvailable(BookingDTO bookingDto);
}
