package net.opentrends.garage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.opentrends.garage.model.Brand;
import net.opentrends.garage.model.Rent;
@Repository
@Transactional
public class RentDaoImpl implements RentDAO{
@Autowired
public SessionFactory sessionFactory;

@Override
public void addRent(Rent rent) {
    sessionFactory.openSession().saveOrUpdate(rent);		
	
}

@Override
public List<Rent> getAllRents() {
	return sessionFactory.getCurrentSession().createQuery("FROM Rent").list();
}

@Override
public void deleteRent(Integer rentID) {
	Rent rent = sessionFactory.getCurrentSession().get(Rent.class, rentID);	
    if(null!=rent){
    	this.sessionFactory.getCurrentSession().delete(rent);
    }	
}

@Override
public Rent updateRent(Rent rent) {
	sessionFactory.getCurrentSession().update(rent);
	return rent;
	}

@Override
public Rent getRent(int rentID) {

	return null;
}

}
