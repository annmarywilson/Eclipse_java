package net.opentrends.garage.service;

import java.util.List;

import net.opentrends.garage.model.Customer;

public interface CustomerService {
	public List listAll();
	public void delete(Customer customer);
	public Customer save(Customer customer);
	public Customer findByCustId(int id);
}
