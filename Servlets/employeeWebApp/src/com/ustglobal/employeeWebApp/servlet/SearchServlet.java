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

import com.ustglobal.employeeWebApp.dao.EmployeeDAO;
import com.ustglobal.employeeWebApp.dto.EmployeeInfo;
import com.ustglobal.employeeWebApp.util.EmployeeDaoManager;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session==null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
		int id = Integer.parseInt(req.getParameter("id"));

		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.searchEmployee(id);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		if(info != null) {
			out.println("<html>");

			out.println("<a href='./home'> Home <a>");
			out.println("<a href=# style='float: right'> Logout <a>");
			out.println("<h3>Employee Name: "+info.getName()+"</h3>");
			out.println("<h3>Emploee id: "+info.getId()+ "</h3>");
			out.println("<h3>Employee Mail Id"+info.getEmail()+"</h3>");
			out.println("<h3>Employee Password"+info.getPassword()+"</h3>");
			out.println("</html>");
		} else
			out.println("<h3>Data not found</h3>");
		out.println("</html>");

	}
}
