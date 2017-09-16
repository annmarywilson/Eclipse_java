package Pizzashop;
import java.util.*;
public class Regular extends Pizza{
	Scanner sn=new Scanner(System.in);
	public Regular(int size) {
		super(size);
		this.type="Regular";
	}
	public Regular() {
		this.type="Regular";
	}
	public void gettopping() {
		int numtop;
		System.out.println("Enter the number of toppings");
		numtop=sn.nextInt();
		if(numtop>4) {
			System.out.println("Sorry!Max 4 toppings allowed for this type");
			System.out.println("Enter the number of toppings");
			numtop=sn.nextInt();
		}
	
			for(int i=0;i<numtop;i++) {
				System.out.println("Enter topping "+(i+1));
				topping.add(sn.next());
				cost+=2.00;
			}
		
	}

}
