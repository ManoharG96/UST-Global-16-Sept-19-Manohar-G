package com.ustglobal.employeeWebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.employeeWebApp.dao.EmployeeDAO;
import com.ustglobal.employeeWebApp.dto.EmployeeInfo;
import com.ustglobal.employeeWebApp.util.EmployeeDaoManager;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//		int id = Integer.parseInt(req.getParameter("id"));
		//		String name = req.getParameter("name");
		//		String email = req.getParameter("email");
		//		String password = req.getParameter("password");

		EmployeeInfo info = new EmployeeInfo();

		info.setId(Integer.parseInt(req.getParameter("id")));
		info.setName(req.getParameter("name"));
		info.setEmail(req.getParameter("email"));
		info.setPassword(req.getParameter("password"));

		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		boolean check = dao.registerEmployee(info);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		if (check ) 
			out.println("<h4>Registration completed</h4>");	
		else
			out.println("<h4>Id cannot be repeated</h4>");
		out.println("</html>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.include(req, resp);
	}

}
