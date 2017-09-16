package Authfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(servletNames="Authfilter.Authhome")
public class Authfil implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pass");
		if(uname.equals("admin")&&pwd.equals("1234")) {
			out.println("<p>Authentication Success</p>");
			chain.doFilter(request, response);
		}else {
			out.println("<p><h1 style=\"color:#FF0000\">!Invalid userID or Password</h1></p>");
			RequestDispatcher rd=request.getRequestDispatcher("/Login.html");
			rd.include(request, response);
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
