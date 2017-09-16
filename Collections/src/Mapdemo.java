import java.util.*;
public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap hm=new HashMap();
	hm.put("Akhil", new Double(2500.26));
	hm.put("Amal", new Double(135.93));
	Set s=hm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next();
		System.out.println("Key:"+me.getKey()+"  Value:"+me.getValue());
	}
	double b=(double)hm.get("Akhil");
	hm.put("Akhil", b+1000);
	System.out.println(hm.get("Akhil"));
	}

}
