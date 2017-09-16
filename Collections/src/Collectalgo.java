import java.util.*;
public class Collectalgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("Brezza");
		l1.add("Dzire");
		l1.add("Ciaz");
		l1.add("Baleno");
		l1.add("Ignis");
		LinkedList l2=new LinkedList();
		l2.add("Compass");
		l2.add("XUV");
		l2.add("Endeavour");
		l2.add("Pajero");
		l2.add("Fortuner");
		Comparator r=Collections.reverseOrder();
		System.out.println("Ciaz found at pos:"+Collections.binarySearch(l1, "Ciaz",r));
		Collections.sort(l1,r);
		Iterator i=l1.iterator();
		System.out.println("\nReversed list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		Collections.shuffle(l1);
		i=l1.iterator();
		System.out.println("\nShuffled list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		System.out.println("Minimum:"+Collections.min(l1));
		System.out.println("Maximum:"+Collections.max(l1));
		 r=Collections.reverseOrder();
		System.out.println("Ciaz found at pos:"+Collections.binarySearch(l1, "Ciaz",r));
		i=l2.iterator();
		System.out.println("\noriginal list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		Collections.reverse(l2);
		i=l2.iterator();
		System.out.println("\nreversed list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		Collections.sort(l2);
		i=l2.iterator();
		System.out.println("\nSorted list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		r=Collections.reverseOrder();
		Collections.sort(l2,r);
		i=l2.iterator();
		System.out.println("\nReverse Sorted list\n");
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
	}

}
