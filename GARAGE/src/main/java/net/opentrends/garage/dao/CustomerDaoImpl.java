package net.opentrends.garage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.opentrends.garage.model.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomersDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List listAll() {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Customer.class);
		return crit.list();
	}

	@Override
	public void delete(Customer customer) {
		Session session=sessionFactory.openSession();
		session.delete(customer);
	}

	@Override
	public Customer save(Customer customer) {
		Session session=sessionFactory.openSession();
		session.save(customer);
		return customer;
	}

	@Override
	public Customer findByCustId(int customerId) {
		Session session=sessionFactory.openSession();
		return session.get(Customer.class, customerId);
	}



}
