import java.io.*;
public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serclass s=null;
		try {
			FileInputStream fin=new FileInputStream("src/Serclass.ser");
			ObjectInputStream ob=new ObjectInputStream(fin);
			s=(Serclass) ob.readObject();
			s.mailcheck();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Serclass not found");
			e.printStackTrace();
		}
		
	}

}
