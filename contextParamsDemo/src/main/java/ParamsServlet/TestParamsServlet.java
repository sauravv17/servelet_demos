package ParamsServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public TestParamsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet");
		PrintWriter out = response.getWriter();
		ServletContext sc =getServletContext();
		String projectName=sc.getInitParameter("projectName");
		
		
		out.println("TestParamsServlet");
		out.println("projectName");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doPost");

	}

}
