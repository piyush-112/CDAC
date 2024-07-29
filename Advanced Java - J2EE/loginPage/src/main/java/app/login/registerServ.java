package app.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServ
 */
@WebServlet("/registerServ")
public class registerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public registerServ() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Im servelet");
		
		String name=request.getParameter("e");
		String cont=request.getParameter("c");
		
		out.println("Name is"+name+"<br>");
		out.println("Contact is:"+cont+"<br>");
	}

}
