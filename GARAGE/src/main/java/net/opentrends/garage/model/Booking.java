package net.opentrends.garage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "BookingID" )
private int BookingID;
@Column(name="From_Date")
private Date From_Date;
@Column(name="To_Date")
private Date To_Date;
@ManyToOne
@JoinColumn(name="CustomerID")
private Customer customer;
@ManyToOne
@JoinColumn(name="ModelID")
private Model model;

public int getBookingID() {
	return BookingID;
}
public void setBookingID(int bookingID) {
	BookingID = bookingID;
}
public Date getFrom_Date() {
	return From_Date;
}
public void setFrom_Date(Date from_Date) {
	From_Date = from_Date;
}
public Date getTo_Date() {
	return To_Date;
}
public void setTo_Date(Date to_Date) {
	To_Date = to_Date;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Model getModel() {
	return model;
}
public void setModel(Model model) {
	this.model = model;
}
}
