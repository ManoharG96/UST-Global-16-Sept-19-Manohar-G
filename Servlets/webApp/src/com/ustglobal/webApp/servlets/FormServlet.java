package com.ustglobal.webApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	public FormServlet() {
		System.out.println("object created");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init started");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empName = req.getParameter("empname");
		String empPass = req.getParameter("emppass");
		String mailId = req.getParameter("empmail");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("Company-name");

		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");

		out.println(empName);
		out.println("<br>");
		out.println(empPass);
		out.println("<br>");
		out.println(mailId);
		out.println("<br>");

		out.println("<br>");

		out.println("<h2>");
		out.println(companyName);
		out.println("<br>");
		out.println(batchName);
		out.println("</h2>");

		out.println("</h1>");		
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void destroy() {
		System.out.println("destoryed");
	}

}