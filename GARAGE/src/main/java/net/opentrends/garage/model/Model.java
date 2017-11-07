package net.opentrends.garage.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Model")
public class Model implements Serializable{
private static final long serialVersionUID = 7402257749737217513L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ModelID",length=11)
private int modelid;
@Column(name="ModelNo")
private String modelno;
@Column(name="Stock")
private int stock;
@ManyToOne
@JoinColumn(name ="BrandID",nullable=false)
private Brand brand;

@OneToOne(mappedBy="model",cascade = CascadeType.ALL)
private Rent rent;

@OneToMany(mappedBy="model",cascade=CascadeType.ALL)
Set<Booking> booking=new HashSet<Booking>();

public Model(){}
public Model(String modelno,int stock,Brand brand,Rent rent){
	this.modelno=modelno;
	this.stock=stock;
	this.brand=brand;
	this.rent=rent;
}

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
public Brand getBrand() {
	return brand;
}
public void setBrand(Brand brand) {
	this.brand = brand;
}
public Rent getRent() {
	return rent;
}
public void setRent(Rent rent) {
	this.rent = rent;
}

}
