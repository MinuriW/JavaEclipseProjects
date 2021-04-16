package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServe extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body bgcolor='tomato'>");
		out.println("<center><h1>Welcome to Servlet</h1><hr>");
		out.println("<h2>Date and Time:"+new Date().toString()+"</h2>");
		out.println("</center></body></html>");
		out.close();
	}

}
