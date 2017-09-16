import java.util.*;
public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Arraylist
 */
		List ar=new ArrayList();
		ar.add("Zara");
		ar.add("meera");
		ar.add("sanjay");
		System.out.println("Arraylist Elements are:");
		System.out.println("ar="+ar);
		
	
/**
 * Linked list
 */
	 List l1 = new LinkedList();
     l1.add("Zara");
     l1.add("Mahnaz");
     l1.add("Ayan");
     System.out.println();
     System.out.println(" LinkedList Elements");
     System.out.print("\t" + l1);
     /**
      * Hashset
      */
     Set s1=new HashSet();
     s1.add("meera");
     s1.add("roy");
     System.out.println("Hashset elements:"+s1);
     /**
      * Hashmap
      */
     Map m1=new HashMap();
     m1.put("6", "Akhil");
     m1.put("7", "Alan");
     System.out.println("Hashmap:"+m1);
     System.out.println("Hashkeys:"+m1.keySet());
     System.out.println("Hash values:"+m1.values());
}
}