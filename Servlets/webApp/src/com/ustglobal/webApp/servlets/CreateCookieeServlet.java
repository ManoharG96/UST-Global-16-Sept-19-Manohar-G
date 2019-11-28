package com.ustglobal.webApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("emp-name", "Guruji");
		
		resp.addCookie(cookie);
		PrintWriter out = resp.getWriter();
		out.println("<h1>cookie is created </h1>");
		
		
		String name = cookie.getName();
		String value = cookie.getValue();
		
		out.println("<h1>Cookie name is: "+name+"</h1>");
		out.println("<h1>Cookie Value is: "+value+"</h1>");
	}
}