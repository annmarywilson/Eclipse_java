package UserRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;


@WebServlet("/User_reg")
public class User_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	java.sql.Connection conn=null;
	Statement stmt=null;
	ResultSet rs = null;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
System.out.println("Inside GET method");
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String JDBC_DRIVER = "jdbc:mysql://localhost/User_Register";  
	    
	      final String USER = "root";
	      final String PASS = "";
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      try {
	         
	          
	          
	          String name = request.getParameter("Name");  
	          String Addr = request.getParameter("Address");  
	          String password = request.getParameter("password");  
	          String Uname = request.getParameter("UserName").trim();  
	          String Password= request.getParameter("password").trim();  
	          String dob= request.getParameter("DOB"); 
	          String gender= request.getParameter("Gender");  
	          String[] hobby= request.getParameterValues("Hobby");
             String sample="";
	         for(String sample1:hobby){
	        	 sample=sample+" "+sample1;
	        	 }
	         
	          Class.forName("com.mysql.jdbc.Driver"); 
	          System.out.println("connection established successfully...!!");   
	          Connection conn = DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
	          java.sql.PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO Table_1 VALUES(?,?)");
	          java.sql.PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO table_PersonalInfo VALUES(?,?,?,?,?)");
	          java.sql.PreparedStatement stmt3 = conn.prepareStatement("INSERT INTO Hobby VALUES (?,?)");

	          

	          stmt1.setString(1,Uname);  
	          stmt1.setString(2,Password);        
	          stmt2.setString(1,Uname);
	          stmt2.setString(2,Addr);
	          stmt2.setString(3,gender);
	          stmt2.setString(4,dob);
	          stmt2.setString(5,name);
	          stmt3.setString(1,Uname);  
	          stmt3.setString(2,sample);
	          
	         
	          int i=stmt1.executeUpdate();
	          int j=stmt2.executeUpdate();
	          int k=stmt3.executeUpdate();

	     if(i==1&&j==1&&k==1){
	    	 out.println("Registration successful");
	    	 out.println("<br>welcome " + Uname);
	    	 HttpSession session=request.getSession();  
	         session.setAttribute("username",Uname);  
	 RequestDispatcher rd=request.getRequestDispatcher("/Display_page");
	 rd.include(request, response);
	     }else{
	    	 out.println("Registration failed");
	     }
	    
	      
	}
catch (Exception e) {
out.println(e);}
	}}
	        
	         
