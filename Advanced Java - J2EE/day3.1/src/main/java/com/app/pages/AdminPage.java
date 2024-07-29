package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.CandidateDaoImpl;
import com.app.entities.Candidate;
import com.app.entities.User;

/**
 * Servlet implementation class AdminPage
 */
@WebServlet("/admin_page")
public class AdminPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5> Welcome Admin!! <h5>");
			
			HttpSession hs = request.getSession();
			
			User userInfo = (User) hs.getAttribute("user_details");
			if (userInfo != null) {
				// get candidate dao from session
				CandidateDaoImpl dao = (CandidateDaoImpl) hs.getAttribute("candidate_dao");
				pw.print("<h5> Hello , " + userInfo.getFirstName() + " " + userInfo.getLastName() + "</h5>");
				
				// Display top 2 candidates in a table
				List<Candidate> candidates = dao.getTop2Candidates();
				pw.print("<h5>Top 2 candidates:</h5>");
				pw.print("<table border='1'>");
				pw.print("<tr><th>Candidate No</th><th>Candidate Name</th><th>Votes</th></tr>");
				int candidateNo = 1;
				for (Candidate c : candidates) {
					pw.print("<tr><td>" + candidateNo++ + "</td><td>" + c.getName() + "</td><td>" + c.getVotes() + "</td></tr>");
				}
				pw.print("</table>");
				
				// Get and display party-wise votes
				Map<String, Integer> partyWiseVotes = dao.getPartyWiseVotes();
				pw.print("<h5>Party-wise votes:</h5>");
				pw.print("<table border='1'>");
				pw.print("<tr><th>Party</th><th>Votes</th></tr>");
				for (Map.Entry<String, Integer> entry : partyWiseVotes.entrySet()) {
					pw.print("<tr><td>" + entry.getKey() + "</td><td>" + entry.getValue() + "</td></tr>");
				}
				pw.print("</table>");
				
//				List<Candidate> candidates = dao.getTop2Candidates();
//				pw.print("<h5>Top 2 candidates:</h5>");
//				for (Candidate c : candidates) {
//					
//					pw.print("<label>name: </label>"+c.getName() +"<label>  votes:  </label>"+ c.getVotes());
//					pw.print("<br>");
//				}
				
//				// Get and display party-wise votes
//				Map<String, Integer> partyWiseVotes = dao.getPartyWiseVotes();
//				pw.print("<h5>Party-wise votes:</h5>");
//				for (Map.Entry<String, Integer> entry : partyWiseVotes.entrySet()) {
//					pw.print("<label>Party: </label>" + entry.getKey() + "<label>  Votes:  </label>" + entry.getValue());
//					pw.print("<br>");
//				}
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("err in do-get of " + getClass(), e);		}

	}

}
