package net.opentrends.garage.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter{

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		String password = req.getParameter("password");
	}


	@Override
	public void destroy() {
		
	}
}
