package net.opentrends.garage.dao;

import java.util.List;

import net.opentrends.garage.dto.BookingDTO;

public interface BookingDAO {
	public List listAll();
	public BookingDTO save(BookingDTO bookingdto);
	public void delete(BookingDTO bookingdto);
	public BookingDTO findByCustId(int customerId);
	public int findAvailablity(BookingDTO bookingDto);
}
