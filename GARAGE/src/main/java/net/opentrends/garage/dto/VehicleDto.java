package net.opentrends.garage.dto;

import java.io.Serializable;

public class VehicleDto implements Serializable{
private static final long serialVersionUID = 2763056830897859211L;
private int brandId;
private String modelNumber;
private int stock;
private int rentperDay;
public int getBrandId() {
	return brandId;
}
public void setBrandId(int brandId) {
	this.brandId = brandId;
}
public String getModelNumber() {
	return modelNumber;
}
public void setModelNumber(String modelNumber) {
	this.modelNumber = modelNumber;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getRentperDay() {
	return rentperDay;
}
public void setRentperDay(int rentperDay) {
	this.rentperDay = rentperDay;
}

}
