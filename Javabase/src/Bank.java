import java.io.*;
public class Bank {
	String accno;
	Double balance;
	public void add(double amount) {
		balance+=amount;
	}
	public double getbalance() {
		return balance;
	}
	public Bank(String no) {
		this.accno=no;
		this.balance=0.0;
	}
	public String getaccno() {
		return accno;
	}
	public void print() {
		System.out.println("Account no:"+accno+"\nBalance:Rs"+getbalance());
	}
	public void withdraw(double amount) throws Userexception {
		if(amount<=balance) {
			balance-=amount;
		}else {
			double need=amount-balance;
			throw new Userexception(need);
		}
	}
}
