package UserRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Catch;


@WebServlet("/Display_page")
public class Display_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String JDBC_DRIVER = "jdbc:mysql://localhost/User_Register";  
	  
	      final String USER = "root";
	      final String PASS = "";
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	     HttpSession session =request.getSession();
	     String str = (String)session.getAttribute("username");
	   
	    
	     out.println(str);
	      
	      try {
	    	  
	    	  Class.forName("com.mysql.jdbc.Driver"); 
	          Connection conn = DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
	          System.out.println("connection established successfully...display!!");   
	          
	          
	          java.sql.PreparedStatement stmt1 = conn.prepareStatement("SELECT * FROM table_PersonalInfo WHERE USERNAME=?");
	          java.sql.PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM Hobby WHERE USERNAME=?");

	          
              stmt1.setString(1, str);
              stmt2.setString(1,str);
              ResultSet rs1 =stmt1.executeQuery();
              ResultSet rs2=stmt2.executeQuery();
              
              if(rs1.next()&&rs2.next()){
            	  String username = rs1.getString("USERNAME");
            	 String address = rs1.getString("Address");
            	 String gender = rs1.getString("Gender");
            	 String dob=rs1.getString("Birthdate");
            	 String name=rs1.getString("Name");
            	 String Hobby=rs2.getString("Hobbies");
            		

                  out.println("<br>username: " + username + "<br>");
                  out.println("address: " + address + "<br>");
                  out.println("Gender: " + gender + "<br>");
                  out.println("DOB: " + dob + "<br>");
                  out.println("Full Name: " + name + "<br>");
                  out.println("You are Interested in: " +Hobby + "<br>");
              }
                 
	        
	         }catch(SQLException E){
	        	 out.println(E);}
	        catch (Exception e) {
           out.println(e); }
	}
	}

	
