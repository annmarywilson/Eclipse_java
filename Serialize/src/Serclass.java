
public class Serclass implements java.io.Serializable {
	public int empno;
	transient int ssn;
	public String empname,empadd;
	public void mailcheck() {
		System.out.println("Mailing a check to :\n"+empno+"\n"+empname+"\n"+empadd+"\n"+ssn);
	}

}
