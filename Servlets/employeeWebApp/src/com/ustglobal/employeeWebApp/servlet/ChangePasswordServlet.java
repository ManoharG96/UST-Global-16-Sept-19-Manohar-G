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

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =  req.getSession(false);

		if (session != null) {
			String newPass = req.getParameter("newpass");
			String confPass = req.getParameter("confpass");
			if(newPass.equals(confPass)) {
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
				dao.changePassword(info.getId(), newPass);
			}else {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h2 style='color: red'>Password didnt matches</h2>");
				out.println("<html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("./changepassword.html");
				dispatcher.forward(req, resp);
			}
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./changepassword.html");
			dispatcher.forward(req, resp);
		}
	}
}
