package com.advj.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/servlet1")
public class MyFilter implements Filter {

	// init method call at once while filter initialized
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Init Method Filter Interface");
	}

	// in doFilter method we can do the process what ever we want
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("In filter My filter");
		PrintWriter out = resp.getWriter();

		String password = req.getParameter("password");
		String name = req.getParameter("name");
		if (password.equals(name)) {
			chain.doFilter(req, resp);// sends request to next resource
		} else {
			out.print("username or password error!");
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
		}

	}

	// call at last use for resource cleaning
	public void destroy() {
		System.out.println("Destroy Method of filter class called");
	}

}
