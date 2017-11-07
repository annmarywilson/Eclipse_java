package net.opentrends.garage.service;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.opentrends.garage.dao.BookingDAO;
import net.opentrends.garage.dto.BookingDTO;
@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingDAO bookingDao;
	@Override
	public List listAll() {
		return this.bookingDao.listAll();
	}

	@Override
	public BookingDTO save(BookingDTO bookingDto) {
		return this.bookingDao.save(bookingDto);
	}

	@Override
	public void delete(BookingDTO bookingDto) {
		this.bookingDao.delete(bookingDto);
	}

	@Override
	public BookingDTO findByKey(int id) {
		return this.bookingDao.findByCustId(id);
	}

	@Override
	public BookingDTO setDates(BookingDTO bookingDto) {
		try {
			java.util.Date fromDate= new SimpleDateFormat("yyyy-MM-dd").parse(bookingDto.getF_Date());
			java.util.Date toDate= new SimpleDateFormat("yyyy-MM-dd").parse(bookingDto.getT_Date());
			bookingDto.setFrom_Date(fromDate);
			bookingDto.setTo_Date(toDate);
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return bookingDto;
	}

	@Override
	public int findAvailable(BookingDTO bookingDto) {
		return this.bookingDao.findAvailablity(bookingDto);
	}

}
