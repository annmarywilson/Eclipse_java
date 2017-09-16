package net.opentrends.generics;

import java.util.ArrayList;

public class Genericchallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Monday");
		al.add("Wednesday");
		al.add("Monday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Friday");
		al.add("Sunday");
		ArrayList<String> al2=retarray(al);
		for(String s:al2) {
			System.out.print(s+" ");
		}
	}
	public static<E extends Comparable<E>> ArrayList<E> retarray(ArrayList<E> list ) {
		boolean res=true;
		ArrayList<E> newlist=new ArrayList<>();
		newlist.add(list.get(0));
		for(int i=1;i<list.size();i++) {
			for(int j=0;j<newlist.size();j++) {
				if(list.get(i)==newlist.get(j)) {
					res=false;
					break;
				}
			}
			if(res==true) {
				newlist.add(list.get(i));
			}else {
				res=true;
			}
		}
		
		return newlist;
	}

}
