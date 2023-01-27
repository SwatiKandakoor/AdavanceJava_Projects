package com.xworkz.datausingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/foot")
public class FootballServlet extends HttpServlet {

	public FootballServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in FootballServlet...");

		String id = req.getParameter("id");
		String team_name = req.getParameter("team_name");
		String team_owner = req.getParameter("team_owner");
		String head_office_loction = req.getParameter("head_office_loction");
		String slection_comm_head = req.getParameter("slection_comm_head");
		String current_team_size = req.getParameter("current_team_size");
		String total_leages_won = req.getParameter("total_leages_won");
		String last_wc_winning_cap = req.getParameter("last_wc_winning_cap");
		String last_wc_won = req.getParameter("last_wc_won");
		String win_percentage = req.getParameter("win_percentage");
		String reached_finals = req.getParameter("reached_finals");
		String world_champions = req.getParameter("world_champions");
		String started_by = req.getParameter("started_by");
		String started_year = req.getParameter("started_year");
		String capatain = req.getParameter("capatain");
		String country = req.getParameter("country");
		String teamMembersCount = req.getParameter("teamMembersCount");
		String tie = req.getParameter("tie");
		String losses = req.getParameter("losses");
		String won = req.getParameter("won");

		System.out.println(id);
		System.out.println(team_name);
		System.out.println(team_owner);
		System.out.println(head_office_loction);
		System.out.println(slection_comm_head);
		System.out.println(current_team_size);
		System.out.println(total_leages_won);
		System.out.println(last_wc_winning_cap);
		System.out.println(last_wc_won);
		System.out.println(win_percentage);
		System.out.println(reached_finals);
		System.out.println(world_champions);
		System.out.println(started_by);
		System.out.println(started_year);
		System.out.println(capatain);
		System.out.println(country);
		System.out.println(teamMembersCount);
		System.out.println(tie);
		System.out.println(losses);
		System.out.println(won);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<spam style='color:red'>");
		write.print("Fottball  id " + id);
		write.print("Fottball  team_name " + team_name);
		write.print("Fottball  team_owner " + team_owner);
		write.print("Fottball  head_office_loction " + head_office_loction);
		write.print("Fottball  slection_comm_head " + slection_comm_head);
		write.print("Fottball  current_team_size " + current_team_size);
		write.print("Fottball  itotal_leages_wond " + total_leages_won);
		write.print("Fottball  last_wc_winning_cap " + last_wc_winning_cap);
		write.print("Fottball  last_wc_won " + last_wc_won);
		write.print("Fottball  win_percentage " + win_percentage);
		write.print("Fottball  reached_finals " + reached_finals);
		write.print("Fottball  world_champions " + world_champions);
		write.print("Fottball  started_by " + started_by);
		write.print("Fottball  started_year " + started_year);
		write.print("Fottball  capatain " + capatain);
		write.print("Fottball  country " + country);
		write.print("Fottball  teamMembersCount " + teamMembersCount);
		write.print("Fottball  tie " + tie);
		write.print("Fottball  losses " + losses);
		write.print("Fottball  won " + won);
		write.print("</html>");
		write.print("</body>");
		write.print("</h1>");
		write.print("</spam>");
		resp.setContentType("text/html");

	}

}
