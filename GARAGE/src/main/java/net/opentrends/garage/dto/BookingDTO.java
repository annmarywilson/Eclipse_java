package net.opentrends.garage.dto;

import java.io.Serializable;
import java.util.Date;

public class BookingDTO implements Serializable{
	private static final long serialVersionUID = 3035456497116222053L;
	private int brandId;
	private int bookingId;
	private int modelId;
	private int customerId;
	private String F_Date;
	private String T_Date;
	private Date From_Date;
	private Date To_Date;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getF_Date() {
		return F_Date;
	}
	public void setF_Date(String f_Date) {
		F_Date = f_Date;
	}
	public String getT_Date() {
		return T_Date;
	}
	public void setT_Date(String t_Date) {
		T_Date = t_Date;
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
	
	
	
	
}
