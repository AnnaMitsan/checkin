package com.project;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {
	public String form;
	public String trueUsername = "anna";
	public String truePassword = "1996";

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		String responce = "Your data is correct!";
		String letter = "Super Java EE developer!";
		
		String user = req.getParameter("user");
		String password = req.getParameter("password");

		if (user.equals(trueUsername) && password.equals(truePassword)) {
		} else {
			responce = "Your data is wrong :(";
			letter = " ";
		}
		resp.getWriter().println(responce);
		resp.getWriter().println(letter);
	}
}