package net.opentrends.generics;

public class Employee {
	public String empname,desig,empno;
	public void Setname(String name){
		this.empname=name;
	}
	public void Setno(String no) {
		this.empno=no;
	}
	public void Setdes(String desig){
		this.desig=desig;
	}
	public Employee(String name,String des,String no ) {
		this.empname=name;
		this.desig=des;
		this.empno=no;
	}
	public String Getname() {
		return empname;
	}
	public String Getno() {
		return empno;
	}
	public String Getdes() {
		return desig;
	}
	public String toString() {
		return "Employee:"+empno+","+empname+","+desig;
	}
	
}
