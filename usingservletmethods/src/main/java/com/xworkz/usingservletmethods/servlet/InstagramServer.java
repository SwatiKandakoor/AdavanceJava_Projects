package com.xworkz.usingservletmethods.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class InstagramServer extends HttpServlet {
	public InstagramServer() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from instagram server...");
		String data = "request, accepts";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from instagram server...");
		String data = "pictures ,songs ";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from instagram server...");
		String data = "mobile ,phone";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("options from instagram server...");
		String data = " ";
		// PrintWriter write=agr0.getWrite();
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("trace from instagram server...");
	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("head from instagram server...");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete from instagram server...");
		String data = "reals,videos ";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/print");
	}

}
