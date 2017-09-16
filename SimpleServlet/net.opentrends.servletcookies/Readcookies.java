

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Readcookies
 */
@WebServlet("/Readcookiespath")
public class Readcookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Cookie[] cookies=null;
	PrintWriter out=response.getWriter();
	cookies=request.getCookies();
	if(cookies!=null) {
		out.println("<h1>Cookies found</h1><br>");
		int i=0;
		for(Cookie c:cookies) {
			i++;
			out.println("<p>"+i+"  &nbsp "+c.getName()+" &nbsp&nbsp&nbsp  "+c.getValue());
		}
	}else {
		out.println("<h1>No cookies Found</h1>");
	}
	}

}
