package net.opentrends.garage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rent")
public class Rent {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="RentID",length=11)	
private int rentid;
@Column(name="Daily_Rent")
private int dailyRent;
@OneToOne
 @JoinColumn(name="ModelID")
private Model model;
public Rent(){
	
}
public Rent(int dailyRent){
	this.dailyRent=dailyRent;
}

public int getRentid() {
	return rentid;
}
public void setRentid(int rentid) {
	this.rentid = rentid;
}
public int getDailyrent() {
	return dailyRent;
}
public void setDailyrent(int dailyrent) {
	this.dailyRent = dailyrent;
}
public Model getModel() {
	return model;
}
public void setModel(Model model) {
	this.model = model;
}

}
