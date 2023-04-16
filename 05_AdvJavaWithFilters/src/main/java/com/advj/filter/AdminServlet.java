package com.advj.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebInitParam(name = "dbdriver", value = "com.jdbc.odbc.driver")
@WebServlet("/servlet1")
public class AdminServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("welcome ADMIN welcome to servlet");
		out.close();

		// once the value set in 
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.getInitParameter("dbdriver"));

	}
}