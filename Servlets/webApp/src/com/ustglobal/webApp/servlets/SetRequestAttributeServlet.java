package com.ustglobal.webApp.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/req-att")
public class SetRequestAttributeServlet extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {

		Employee e = new Employee();
		e.setId(1);
		e.setName("siri");
		req.setAttribute("obj", e);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/usebean.jsp");
		dispatcher.forward(req, resp);
		
	}
}
