package net.opentrends.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exceptionhandle
 */
@WebServlet("/Exceptionhandlepath")
public class Exceptionhandle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Throwable th=(Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer sc=(Integer) request.getAttribute("javax.servlet.error.status_code");
		String servname=(String) request.getAttribute("javax.servlet.error.servlet_name");
		String requrl=(String) request.getAttribute("javax.servlet.error.request_uri");
		PrintWriter out=response.getWriter();
		if(servname=="null") {
			servname="unknown";
		}
		if(requrl=="null") {
			requrl="unknown";
		}
		response.setContentType("text/html");
		if(th==null&&sc==null) {
			out.println("<p>Error info not found</p><p>return to <a href="+response.encodeUrl("http://localhost:8080/")+">homepage</a></p>");
		}else if(sc!=null) {
			out.println("Status Code: "+sc);
		}else {
			out.println("Error Info<br><br>Servlet Name:"+servname+"<br>Exception type:"+th.getClass().getName()+"<br> Error Message:"+th.getMessage()+"<br>Request url:"+requrl);
		}
		
	}

}
