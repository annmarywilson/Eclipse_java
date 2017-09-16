package net.opentrends.generics;

public class Contact {
	public String salut,name,phone;
	public Contact(String sal,String name,String phone) {
		salut=sal;
		this.name=name;
		this.phone=phone;
	}
	public void Setsal(String s) {
		salut=s;
	}
	public void Setname(String n) {
		name=n;
	}
	public void Setphone(String p) {
		phone=p;
	}
	public String Getsal() {
		return salut;
	}
	public String Getname() {
		return name;
	}
	public String Getphone() {
		return phone;
	}
	public String toString() {
		return "Contact:"+salut+"."+name+"-"+phone;
	}
}
