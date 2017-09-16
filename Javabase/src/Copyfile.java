import java.io.*;
public class Copyfile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileInputStream fin=null;
FileOutputStream fout=null;
try {
	fin=new FileInputStream("src/input.txt");
	fout=new FileOutputStream("src/output.txt");
	int c;
	while((c=fin.read())!=-1) {
		fout.write(c);
	}
}
catch(IOException i) {
	System.out.println(i);
}
if(fin!=null) {
	fin.close();
}
if(fout!=null) {
	fout.close();
}
	}

}
