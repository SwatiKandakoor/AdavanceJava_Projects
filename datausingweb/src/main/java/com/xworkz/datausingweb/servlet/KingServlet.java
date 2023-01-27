package com.xworkz.datausingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in kingservlet...");
		
		String name=req.getParameter("name");
		String region=req.getParameter("region");
		String noOfQueens=req.getParameter("noOfQueens");
		String DOB=req.getParameter("DOB");
		String DOD=req.getParameter("DOD");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<spam style='color:red'>");
		write.print("King name "+name);
		write.print("King region"+region);
		write.print("King noOfQueens"+noOfQueens);
		write.print("King DOB"+DOB);
		write.print("King DOD"+DOD);
		write.print("</html>");
		write.print("</body>");		
		write.print("</h1>");
		write.print("</spam>");
		resp.setContentType("text/html");

	}

}
