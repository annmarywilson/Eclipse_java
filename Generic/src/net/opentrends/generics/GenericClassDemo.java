package net.opentrends.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<Employee> p1=new Person<>();
		Person<Contact> c1=new Person<>();
		Employee e=new Employee("Akhil","Trainee","117");
		Contact c=new Contact("Mr","Raj","9495805680");
		p1.setPerson(e);
		c1.setPerson(c);
		System.out.println(p1.getPerson().toString());
		System.out.println(c1.getPerson().toString());
	}
	

}
