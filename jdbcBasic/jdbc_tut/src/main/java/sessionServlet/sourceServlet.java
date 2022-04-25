package sessionServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sourceServlet")
public class sourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='targetServlet'>Click here to get user name</a>" );
	}

}
