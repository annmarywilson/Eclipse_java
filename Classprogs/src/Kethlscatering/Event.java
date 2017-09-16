package Kethlscatering;
import java.util.*;
public class Event {
	Scanner sn=new Scanner(System.in);
	private String eventtype,eventno,eventdate;
	public static int no=0;
	private int guestno;
	private final double cost=40;
	public void settype()
	{
		System.out.println("Enter the type of event:\nW - Wedding \nE- Engagement\nB- Birthdays\nR- Retirement\nG- Gettogethers");
		char t=sn.next().charAt(0);
		if(t=='w'||t=='W')
		{
			eventtype="Wedding";
			seteventno("Wedding");
		}
		else
			if(t=='e'||t=='E')
			{
				eventtype="Engagemnt";
				seteventno("Engagement");
			}
			else
				if(t=='B'||t=='b')
				{
					eventtype="Birthday";
					seteventno("Birthday");
				}
				else
					if(t=='r'||t=='R')
					{
						eventtype="Retirement";
						seteventno("Retirement");
					}
					else
						if(t=='g'||t=='G')
						{
							eventtype="Gettogether";
							seteventno("Gettogether");
						}
						else
						{
							System.out.println("Invalid type \n Press Y to try again Q to quit");
							char res=sn.next().charAt(0);
							if(res=='y'||res=='Y')
								settype();
							else
								System.exit(1);
							sn.next();
							}
							
	}
	public String gettype()
	{
		return eventtype;
	}
	public void setdate()
	{
		System.out.println("Enter event date (DD/MM/YYYY)");
		eventdate=sn.next();
	}
	public String getdate()
	{
		return eventdate;
	}
	public void setno()
	{
		System.out.println("Enter number of guests:");
		guestno=sn.nextInt();
	}
	public int getno()
	{
		return guestno;
	}
	public double getcost()
	{
		return cost;
	}
	public void seteventno(String t)
	{
		no++;
		eventno=""+t.charAt(0)+no;
	}
	public String geteventno()
	{
		return eventno;
	}
	public Double gettotal()
	{
		return (cost*guestno);
	}
	public void printevent() {
		System.out.println(eventno+"\n"+eventtype+"\non "+eventdate+"\ngGuests: "+guestno+"\n\nTotal Cost: "+gettotal());
	}
	public Event()
	{
		settype();
		setdate();
		setno();
		
	}
	public Event(String eventname)
	{
		eventtype=eventname;
		seteventno(eventname);
		setdate();
		setno();
		
	}
	public Event(String eventname,String eventdate)
	{
		eventtype=eventname;
		this.eventdate=eventdate;
		seteventno(eventname);
		setno();
	}
	public Event(String eventname,String eventdate, int no)
	{
		eventtype=eventname;
		seteventno(eventname);
		this.eventdate=eventdate;
		guestno=no;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event ev=new Event();
		ev.printevent();
	}

}
