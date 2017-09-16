package Pizzashop;

import java.util.Scanner;

public class Sicilian extends Pizza{
	Scanner sn=new Scanner(System.in);
	public Sicilian(int size) {
		super(size);
		this.type="Sicilian";
	}
	public Sicilian() {
		this.type="Sicilian";
	}
	public void gettopping() {
		int numtop;
		System.out.println("Enter the number of toppings");
		numtop=sn.nextInt();
		if(numtop>2) {
			System.out.println("Sorry!Max 2 toppings allowed for this type");
			System.out.println("Enter the number of toppings");
			numtop=sn.nextInt();
		}
		
			for(int i=0;i<numtop;i++) {
				System.out.println("Enter topping "+(i+1));
				topping.add(sn.next());
				cost+=3.00;
			}
		
	}

}
