package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		req.setAttribute("capital","delhi");
		req.setAttribute("cities","mumbai");
		req.removeAttribute("capital");
		req.setAttribute("cities","banglore");
		out.println("<h1>This is ServletRequestAttributeListener Demo </h1>");
	}

}
