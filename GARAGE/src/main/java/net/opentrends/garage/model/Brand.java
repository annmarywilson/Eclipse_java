package net.opentrends.garage.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Brand")
public class Brand {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "BrandID", length = 11 )
private int brandid;
@Column(name = "Name")
private String brandname;
@Column(name="Country_Orgin")
private String country;
@OneToMany(mappedBy="brand")
private Set<Model> model;


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
public Set<Model> getModel() {
	return model;
}
public void setModel(Set<Model> model) {
	this.model = model;
}




}
