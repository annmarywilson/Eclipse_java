package UserRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  final String JDBC_DRIVER = "jdbc:mysql://localhost/User_Register";  
	      final String USER = "root";
	      final String PASS = "";
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String Username=request.getParameter("uname");
	      String pwd =request.getParameter("pass");
	      try {
	    	  Class.forName("com.mysql.jdbc.Driver"); 
	          Connection conn = DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
	          System.out.println("connection established successfully...!!");   
	          
	          
	          java.sql.PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Table_1 WHERE USERNAME=? AND PASSWORD=?");
              stmt.setString(1,Username);
              stmt.setString(2,pwd);
              ResultSet rs =stmt.executeQuery();
              
              if(rs.next()){
            	  
            	  HttpSession session=request.getSession();  
     	         session.setAttribute("username",Username); 
//     	         response.sendRedirect("Display_page");
     	        out.println(" Welcome ");
            	  RequestDispatcher rd=request.getRequestDispatcher("/Display_page");
                  rd.include(request,response);
              }else{out.println("invalid login credentials");}
                
	        
	         }catch(SQLException E){
	        	 out.println(E);}
	        catch (Exception e) {
           out.println(e); }
	}
	
	}


