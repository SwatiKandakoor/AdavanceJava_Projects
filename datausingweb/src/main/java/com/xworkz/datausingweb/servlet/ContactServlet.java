package com.xworkz.datausingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running from dopost contact servlet....");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		//long mobileNumber = Long.parseLong("mobile");
		
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		

		if (name.length() > 3 && email.length() > 6 && mobile.length() == 10 && comments.length() > 3) {

			writer.print("<spam  style='color:red;'>");
			writer.print("success" + name);
			writer.print("</spam>");
			writer.print("</h1>");
			writer.print("<a href=\"index.html\">Homepage</a>");

		} else {
			writer.print("<span style='color:red;'>");
			writer.print("not valid");
			writer.print("<a href=\"index.html\">Home page</a>");
			writer.print("</span>");

		}

		writer.print("</body>");
		writer.print("</html>");
	}
}
