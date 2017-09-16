package net.opentrends.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServEX2
 */
//@WebServlet("/ServEX2path")
public class ServEX2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	public void init()throws ServletException{
		message="Hello Servlet 2";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter w=response.getWriter();
		w.println("<h1>"+message+"</h1>");
	}

}
