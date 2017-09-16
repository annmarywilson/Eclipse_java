package net.opentrends.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
@WebFilter(servletNames = "net.opentrends.servlet.Paramet",initParams= {@WebInitParam(name="defaultuser",value="arun")})


public class Logfilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		String testparam=filterConfig.getInitParameter("defaultuser");
		System.out.println("Initialization parameter:"+testparam);
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String ip=request.getRemoteAddr();
		PrintWriter out=response.getWriter();
		String d=new Date().toString();
		out.println("<p>Request IP: "+ip+"</p><p>System Date: "+d+"</p>");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
