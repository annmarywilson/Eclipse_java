package net.opentrends.generics;

public class Genericmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i= {10,20,30,40,50,60,70,80};
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		print(i);
		print(days);
		System.out.println(findlarge(i,50));
		System.out.println(findlarge(days,"Monday"));
	}
	public static<T extends Comparable<T>> int findlarge(T[] list,T elem) {
		int count=0;
		for(T el:list) {
			if(el.compareTo(elem)>0) {
				count++;
			}
			
		}
		return count;
	}
	public static<E> void print(E[] list) {
		for(E elem:list) {
			System.out.print(elem+" ");
		}
		System.out.println("");
	}
}
