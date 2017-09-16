import java.io.*;
import java.util.*;
public class Demobank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter accno:");
		String no=sc.nextLine();
		Bank b=new Bank(no);
		boolean res=true;
		double am;
		while(res) {
		System.out.println("Enter option\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n");
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("enter amount to be deposited:");
			 am=sc.nextDouble();
			b.add(am);
			System.out.println("Rs "+am+" Deposited to your account");
			b.print();
			break;
		case 2:
			try {
				System.out.println("Enter amount to be withdrawn:");
				am=sc.nextDouble();
				b.withdraw(am);
				System.out.println("Rs "+am+" Withdrawed from your account");
				b.print();
			
			}
			catch(Userexception e) {
				System.out.println("You dont have sufficient balance, need Rs"+e.getamount()+" to continue");
			}
			break;
		case 3:
			b.print();
			break;
		default:
				System.out.println("Invalid option");
			break;
		}
		System.out.println("Do you want another transaction Y or N");
		char ch=sc.next().charAt(0);
		if(ch=='n'||ch=='N') {
			res=false;
			//sc.next();
		}
			
		
		}
		System.out.println("Thanks for using our service");
	}

}
