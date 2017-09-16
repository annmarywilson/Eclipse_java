package Pizzashop;

import java.util.*;

public abstract class Pizza implements Comparable{
	public int size;
	public String type;
	public ArrayList<String> topping=new ArrayList<String>();
	public double cost;
	public double price[]= {30.00,45.00,60.00,80.00};
	public static final int small=12;
	public static final int large=18;
	public static final int medium=15;
	public static final int xlarge=20;
	public Pizza()
	{
		type="";
	}
	public Pizza(int size)
	{
		switch(size)
		{
		case 12:{
			this.size=small;
			cost=price[0];
			}break;
		case 15:{
			this.size=medium;
			cost=price[1];
			}break;
		case 18:{
			this.size=large;
		
			cost=price[2];
			}break;
		case 20:{
			this.size=xlarge;
			cost=price[3];
			}break;
		default:{
			System.out.println("invalid size");
			}break;
		}
	}
	public abstract void gettopping();
	public int compareTo(Object t){
		int result=0;
		Pizza p=(Pizza)t;
		if(this.size<p.size) {
			result= -1;
		}else {
			if(this.size==p.size) {
				result= 0;
			}else {
				if(this.size>p.size)
					result= 1;
			}
		}
		
			
		return result;
	}
	public void printorder()
	{
		String top="";
		if(topping.size()==0) {
			System.out.println("no toppings selected");
		}
		else {
			for(int i=0;i<topping.size();i++) {
				top+=topping.get(i)+",";
			}
		}
			
		System.out.println("Your Order is Placed with type "+type+" of size "+size+" with toppings "+top+"\n Total cost is:$"+cost);
	System.out.println("Thank You For Shoping");
	}
	
}
