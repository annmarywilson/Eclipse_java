import java.io.*;
import java.util.*;
public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		FileWriter fout=new FileWriter("src/output.txt",true);
		BufferedWriter b=new BufferedWriter(fout);
		String line;
		System.out.println("Enter the text");
		line=sc.nextLine();
		b.write(line);
		b.close();
		}
		catch(FileNotFoundException f) {
			System.out.println("cant open file");
		}
		catch(IOException i) {
			System.out.println(i);
		}
		
		
	}

}
