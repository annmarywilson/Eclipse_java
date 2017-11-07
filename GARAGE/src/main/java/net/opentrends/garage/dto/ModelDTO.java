package net.opentrends.garage.dto;

import java.io.Serializable;


public class ModelDTO implements Serializable{

private static final long serialVersionUID = 3749530348083065083L;

private int modelid;
private String modelno;
private int stock;
public int getModelid() {
	return modelid;
}
public void setModelid(int modelid) {
	this.modelid = modelid;
}
public String getModelno() {
	return modelno;
}
public void setModelno(String modelno) {
	this.modelno = modelno;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

}
