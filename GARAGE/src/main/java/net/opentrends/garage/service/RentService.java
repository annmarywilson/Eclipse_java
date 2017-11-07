package net.opentrends.garage.service;

import java.util.List;

import net.opentrends.garage.model.Rent;


public interface RentService {
	public void addRent(Rent rent);
	public List<Rent> getAllRents();
	public void deleteRent(Integer rentID);
	public Rent updateRent(Rent rent);
	public Rent getRent(int rentID);
}
