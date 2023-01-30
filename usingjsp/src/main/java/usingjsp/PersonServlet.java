package usingjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
	public PersonServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost method");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);

		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
        dispatcher.forward(req, resp);
	}

}
