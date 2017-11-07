package net.opentrends.garage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import net.opentrends.garage.dto.BookingDTO;
import net.opentrends.garage.model.Booking;
import net.opentrends.garage.model.Customer;
import net.opentrends.garage.model.Model;
@Repository
@Transactional
public class BookingDaoImpl implements BookingDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List listAll() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Booking.class);
		List<Booking> bookingList= criteria.list();
		List<BookingDTO> bookingDtoList=new ArrayList<>();
		for(Booking booking:bookingList) {
			BookingDTO bookingDto=new BookingDTO();
			BeanUtils.copyProperties(booking, bookingDto);
			bookingDto.setCustomerId(booking.getCustomer().getCustomerId());
			bookingDto.setModelId(booking.getBookingID());;
			bookingDtoList.add(bookingDto);
		}
		return bookingDtoList;
	}

	@Override
	public BookingDTO save(BookingDTO bookingdto) {
		Session session=sessionFactory.openSession();
		Booking booking=new Booking();
		BeanUtils.copyProperties(bookingdto, booking);
		booking.setCustomer(session.get(Customer.class, bookingdto.getCustomerId()));
		booking.setModel(session.get(Model.class, bookingdto.getModelId()));
		session.save(booking);
		return bookingdto;
	}

	@Override
	public void delete(BookingDTO bookingdto) {
		Session session=sessionFactory.openSession();
		Booking booking=session.get(Booking.class, bookingdto.getBookingId());
		session.delete(booking);
		}

	@Override
	public BookingDTO findByCustId(int customerId) {
		Session session=sessionFactory.openSession();
		Booking booking= session.get(Booking.class, customerId);
		BookingDTO bookingDto=new BookingDTO();
		BeanUtils.copyProperties(booking, bookingDto);
		bookingDto.setCustomerId(booking.getCustomer().getCustomerId());
		bookingDto.setModelId(booking.getModel().getModelid());
		return bookingDto;

	}

	@Override
	public int findAvailablity(BookingDTO bookingDto) {
		Criteria criteria=sessionFactory.openSession().createCriteria(Booking.class);
		Criterion model= Restrictions.eq("model.modelid", bookingDto.getModelId());
		
		Criterion fromDateGreaterThan=Restrictions.le("From_Date", bookingDto.getFrom_Date());
		Criterion fromDateLessThan= Restrictions.ge("To_Date", bookingDto.getFrom_Date());
		Criterion fromAnd=Restrictions.and(fromDateGreaterThan, fromDateLessThan);
		
		Criterion toDateGreaterThan=Restrictions.le("From_Date", bookingDto.getTo_Date());
		Criterion toDateLessThan= Restrictions.ge("To_Date", bookingDto.getTo_Date());
		Criterion toAnd=Restrictions.and(toDateGreaterThan, toDateLessThan);
		
		Criterion dateInBetweenLess=Restrictions.gt("From_Date",bookingDto.getFrom_Date());
		Criterion dateInBetweenGreat=Restrictions.lt("To_Date",bookingDto.getTo_Date());
		Criterion dateInBetween=Restrictions.and(dateInBetweenLess, dateInBetweenGreat);
		
		Criterion orFromTo=Restrictions.or(fromAnd, toAnd);
		Criterion orFromToBetween=Restrictions.or(orFromTo, dateInBetween);
		Criterion finalQuery=Restrictions.and(orFromToBetween, model);
		
		criteria.add(finalQuery);
		int bookedNo=criteria.list().size();
		System.out.println("on rent============"+bookedNo);
		int stock=sessionFactory.openSession().get(Model.class, bookingDto.getModelId()).getStock();
//		int x=stock-bookedNo;
//		System.out.println(x);
		return stock-bookedNo;
	}


}
