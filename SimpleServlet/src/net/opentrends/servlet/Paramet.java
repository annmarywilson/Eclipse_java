package net.opentrends.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Paramet
 */
@WebServlet(urlPatterns="/Parametpath",
initParams= {@WebInitParam(name="defaultuser",value="Amal")})

public class Paramet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter w=response.getWriter();
		String use=request.getParameter("uname");
		w.println("<h2>hello "+use+"</h2>You Study<h3>");
		String[] sub=request.getParameterValues("sub");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if (use!=null && use!=""){
			session.setAttribute("uname", use);
			context.setAttribute("uname", use);
		}
//		for(int i=0;i<sub.length;i++) {
//			w.println("<br>"+sub[i]);
//		}
		w.println("<br>Session name:"+(String) session.getAttribute("uname")+"<br>Context name:"+(String) context.getAttribute("uname")+"<br>Deafult username:"+getServletConfig().getInitParameter("defaultuser")+"</h3>");
		
	}

}
