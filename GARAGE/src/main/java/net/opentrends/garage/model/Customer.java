package net.opentrends.garage.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CustomerID" )
private int customerId;
@Column(name = "Customer_Name")
private String customerName;
@Column(name="Place")
private String place;
@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
Set<Booking> booking=new HashSet<Booking>();



public Customer(){}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

}
