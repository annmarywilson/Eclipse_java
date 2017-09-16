

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookieservlet
 */
@WebServlet("/cookieservletpath")
public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie fn=new Cookie("firstname", request.getParameter("fname"));
		Cookie ln=new Cookie("lastname", request.getParameter("lname"));
		fn.setMaxAge(60*60*24);
		ln.setMaxAge(60*60*24);
		response.addCookie(fn);
		response.addCookie(ln);
		PrintWriter out=response.getWriter();
		out.println("<p><h2>Welcome :"+request.getParameter("fname")+" &nbsp"+request.getParameter("lname")+"</h2></p>");
				
	}

}
