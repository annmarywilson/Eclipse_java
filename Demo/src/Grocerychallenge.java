import java.util.*;
public class Grocerychallenge {
static Scanner sn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total=gettotal();
		System.out.println("Total amount is:"+total);
	}
	public static double gettotal()
	{
		double total=0;
		Boolean more=true;
		char res;
		while(more)
		{
		total+=getitemprice(getitemname());
		System.out.println("Do you have more items Y or N");
		res=sn.next().charAt(0);
		if(res=='n'||res=='N')
			more=false;
		sn.nextLine();
		}
		return total;
	}
	public static String getitemname()
	{
		System.out.println("Enter item name");
		String name=sn.nextLine();
		return name;
	}
	public static double getitemquantity()
	{
		System.out.println("Enter quantity");
		double q=sn.nextInt();
		return q;
	}
	public static double getitemprice(String Value)
	{
		System.out.println("enter price for the item "+Value);
		double rate=sn.nextInt();
		double quantity=getitemquantity();
		return quantity*rate;
	}
}
