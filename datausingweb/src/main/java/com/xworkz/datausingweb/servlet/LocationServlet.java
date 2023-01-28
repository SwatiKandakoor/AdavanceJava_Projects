package com.xworkz.datausingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running from dopost loction servlet.....");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 3 && email.length() > 6 && destination.length() > 3 && gender != null) {
			writer.print("<span style='color:blue;'>");
			writer.print("success" + name);
			writer.print("</span>");
			writer.print("</h1>");

			writer.print("<a href=\"index.html\">Home page</a>");
		} else {
			writer.print("<span style='color:blue;'>");
			writer.print("not valid");
			writer.print("<a href=\"index.html\">Home page</a>");
			writer.print("</span>");

		}
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
