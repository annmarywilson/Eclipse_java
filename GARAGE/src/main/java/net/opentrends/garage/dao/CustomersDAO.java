package net.opentrends.garage.dao;

import java.util.List;

import net.opentrends.garage.model.Customer;

public interface CustomersDAO {
	public List listAll();
	public void delete(Customer customer);
	public Customer save(Customer customer);
	public Customer findByCustId(int customerId);

}
