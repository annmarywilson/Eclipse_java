import java.util.Scanner;
public class Collegecost {
static Scanner sn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double yrcost;
	yrcost=getyrcost();
	System.out.println("Total yearly cost of college is:"+yrcost);

	}
	public static double gettype()
	{
		char t;
		double tot=0;
		System.out.println("Enter type of accomodation\nD:Dorm\nZ:Other");
		t=sn.next().charAt(0);
		if(t=='D'||t=='d')
			tot=getdormcost();
		return tot;
		
	}
	public static double getduration()
	{
		double d;
		System.out.println("Enter duration in weeks");
		d=sn.nextDouble();
		return d;
	}
	public static double getweekexp()
	{
		double d;
		System.out.println("Enter estimated expense per week");
		d=sn.nextDouble();
		return d;
	}
	public static double getcostroomnboard()
	{
		double d;
		System.out.println("Enter cost of room and board per week");
		d=sn.nextDouble();
		return d;
	}
	public static double getdormcost()
	{
		double dur,wexp,rnb,tot;
		dur=getduration();
		wexp=getweekexp();
		rnb=getcostroomnboard();
		tot=(wexp+rnb)*dur;
		return tot;
	}
	public static String getname()
	{
		String n;
		System.out.println("Enter student name");
		n=sn.nextLine();
		return n;
	}
	public static String getyear()
	{
		String n;
		System.out.println("Student status: ");
		n=sn.nextLine();
		return n;
	}
	public static double gettextcost()
	{
		double n;
		System.out.println("Enter textbook cost");
		n=sn.nextDouble();
		return n;
	}
	public static double credithrcost()
	{
		double c,hr,tot;
		System.out.println("enter number of credit hours");
		hr=sn.nextDouble();
		System.out.println("enter cost per credit hours");
		c=sn.nextDouble();
		tot=c*hr;
		return tot;
		
	}
	public static double gettotal()
	{
		String name=getname();
		String yr=getyear();
		double txt=gettextcost();
		double crd=credithrcost();
		double dorm=gettype();
		
		double tot=txt+crd+dorm;
		printcost(tot,name);
		return tot;
	}
	public static void printcost(Double t,String s)
	{
		System.out.println("Total Cost for "+s+" is:"+t);
	}
	public static double getyrcost()
	{
		double gtotal=0;
		boolean res=true;
		char r;
		while(res)
		{
			gtotal+=gettotal();
			System.out.println("Do you want to continue Y or N");
			r=sn.next().charAt(0);
			if(r=='N'||r=='n')
				res=false;
			sn.nextLine();
		}
		return gtotal;
	}
}
