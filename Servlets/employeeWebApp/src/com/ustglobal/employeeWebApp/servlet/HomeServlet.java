package com.ustglobal.employeeWebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.employeeWebApp.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {
			EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
			PrintWriter out = resp.getWriter();
			out.println("<html>");

			out.println("<h1>Welcome" +info.getName()+"<h1>");
			out.println("<a href='./search.html'>Search</a>");
			out.println("<a href='./changepassword.html'>Change Password</a>");
			out.println("<a href='./logout'>Logout</a>");
			out.println("</html>");
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
