package com.xworkz.datausingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from WebSeries server...");

		String name = req.getParameter("name");
		String lang = req.getParameter("lang");
		String episodes = req.getParameter("episodes");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(lang);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		
		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<spam style='color:red'>");
		write.print("webseries "+name);
		write.print("webseries"+lang);
		write.print("webseries"+episodes);
		write.print("webseries"+ott);
		write.print("webseries"+budget);
		write.print("</html>");
		write.print("</body>");		
		write.print("</h1>");
		write.print("</spam>");
		resp.setContentType("text/html");
		
		


	}
}
