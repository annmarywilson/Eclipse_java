package net.opentrends.garage.dto;

import java.io.Serializable;

public class BrandDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7351487738922041778L;
	private int brandid;
	private String brandname;
	private String country;
	
	
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
