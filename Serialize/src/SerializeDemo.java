import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serclass s=new Serclass();
		s.empno=1001;
		s.empname="Akshay";
		s.empadd="26-rainline lane,Chikpet,Bengaluru";
		s.ssn=12556;
		try {
		FileOutputStream fout=new FileOutputStream("src/Serclass.ser");
		ObjectOutputStream ob=new ObjectOutputStream(fout);
		ob.writeObject(s);
		ob.close();
		fout.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
