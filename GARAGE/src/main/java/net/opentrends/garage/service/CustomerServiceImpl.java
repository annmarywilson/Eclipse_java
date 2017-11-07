package net.opentrends.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.opentrends.garage.dao.BrandDAO;
import net.opentrends.garage.dao.CustomersDAO;
import net.opentrends.garage.model.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomersDAO customerDao;

	@Override
	@Transactional
	public List listAll() {
		return this.customerDao.listAll();
	}

	@Override
	@Transactional
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
	}

	@Override
	@Transactional
	public Customer save(Customer customer) {
		return this.customerDao.save(customer);
	}

	@Override
	@Transactional
	public Customer findByCustId(int customerId) {
		return this.customerDao.findByCustId(customerId);
	}


}
