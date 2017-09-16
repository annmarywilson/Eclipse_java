import java.io.*;
public class Userexception extends Exception {
double amount;
public  Userexception(double amount) {
this.amount=amount;	
}
public double getamount() {
	return amount;
}
}
