package net.opentrends.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.opentrends.garage.dao.RentDAO;
import net.opentrends.garage.model.Rent;

@Service
@Transactional
public class RentServiceImpl implements RentService{
    @Autowired
	private RentDAO rentDao;

	@Override
	@Transactional
	public void addRent(Rent rent) {
     rentDao.addRent(rent);
	}

	@Override
	@Transactional
	public List<Rent> getAllRents() {
		return rentDao.getAllRents();
	}

	@Override
	@Transactional
	public void deleteRent(Integer rentID) {
		rentDao.deleteRent(rentID);
	}

	@Override
	public Rent updateRent(Rent rent) {
		return rentDao.updateRent(rent);
	}

	@Override
	public Rent getRent(int rentID) {
		return rentDao.getRent(rentID);
	}

	public void setRentDao(RentDAO rentDao) {
		this.rentDao = rentDao;
	}
}
