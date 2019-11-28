package com.ustglobal.employeeWebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginpage.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies!=null) {
			for (Cookie cookie: cookies) {
				if(cookie.getName().equals("AlwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<form action='./login'method='post'>\r\n" + 
				"		<div class='container'align='center'>\r\n" + 
				"			<h3>LogIn Page</h3>\r\n" + 
				"			<label for='id'><b>Id</b></label> <br>\r\n" + 
				"			<input type='text'placeholder='Enter Id'name='id'required><br>\r\n" + 
				"			<label for='password'><b>Password</b></label><br> \r\n" + 
				"			<input type='password'placeholder='Enter Password'name='password'required><br>\r\n" + 
				"			<button type='submit'>Login</button><br>\r\n" + 
				"			<label> <input type='checkbox'checked='checked'name='remember'value='checked'> Remember me</label><br>\r\n" + 
				"		<a href='./register'>Register form</a>\r\n" + 
				"		</div>\r\n" + 
				"		\r\n" + 
				"	</form>");
	}
}
