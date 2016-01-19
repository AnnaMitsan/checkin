package com.project;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {
	public String form;
	public String userName = "anna";
	public String pass = "1996";

	{
		form = "<form method = \"post\">"
				+ "<center>Sing in:</center>"
				+ "<p><label>Usename <input type = \"text\" name = \"user\"></p>"
				+ "<p><label>Password <input type = \"password\" name = \"password\"></p>"
				+ "<input type = \"submit\">" + "</form>";

	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println(form);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		String responce = "You data are correct!";
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		String letter = "Super Java EE developer!";

		if (user.equals(userName) && password.equals(pass)) {
		} else {
			responce = "You data are wrong :(";
			letter = " ";
		}
		resp.getWriter().println(responce);
		resp.getWriter().println(letter);

	}

}