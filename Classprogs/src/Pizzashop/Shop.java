package Pizzashop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String res="y";
		ArrayList<Pizza> pizzaz=new ArrayList<Pizza>();
		
		System.out.println("Enter the customer name:");
		String cname=sn.nextLine();
		while(res.equalsIgnoreCase("y"))
		{
		System.out.println("Enter the type: Regular     Sicilian");
		String type=sn.nextLine();
		if(type.equalsIgnoreCase("Regular")) {
			System.out.println("Enter the size: S M L XL");
			String size=sn.nextLine();
			Regular pizza=new Regular();
			if(size.equalsIgnoreCase("S")) {
				pizza= new Regular(12);
			}else if(size.equalsIgnoreCase("M")) {
					pizza=new Regular(15);
				}else if(size.equalsIgnoreCase("L")) {
						pizza=new Regular(18);
					}else if(size.equalsIgnoreCase("XL")) {
							pizza=new Regular(20);
						}else {
							System.out.println("Invalid Size");
						}
					pizza.gettopping();
					
					pizzaz.add(pizza);
			
		}else if(type.equalsIgnoreCase("Sicilian")) {
			System.out.println("Enter the size: S M L ");
			String size=sn.nextLine();
			Sicilian pizza=new Sicilian();
			if(size.equalsIgnoreCase("S")) {
				pizza= new Sicilian(12);
			}else if(size.equalsIgnoreCase("M")) {
					pizza=new Sicilian(15);
				}else if(size.equalsIgnoreCase("L")) {
						pizza=new Sicilian(18);
					}else {
							System.out.println("Invalid Size");
						}
					pizza.gettopping();
					
					pizzaz.add(pizza);
			
		}
		System.out.println("do you want to add another Pizza y or n");
		res=sn.nextLine();
		
		}
		for(Pizza p:pizzaz) {
			p.printorder();
		}
	}

}
