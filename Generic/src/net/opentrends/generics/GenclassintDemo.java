package net.opentrends.generics;

import java.security.GeneralSecurityException;

public class GenclassintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geninterfaceclass<String> s=new Geninterfaceclass<>();
		s.add("Hello go");
		s.display();
		Geninterfaceclass<Integer> p=new Geninterfaceclass<>();
		p.add(55);
		p.display();
		Geninterfaceclass<Double> d=new Geninterfaceclass<>();
		d.add(100.56);
		d.display();
	}

}
