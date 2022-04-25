package listnerDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/demoServlet")
public class demoServletFilter extends HttpFilter implements Filter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("inside doFilter");
		PrintWriter out =response.getWriter();
		out.println("Before Calling demoServlet..");
		chain.doFilter(request, response);
		out.println("After Calling demoServlet..");

	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init..");

		// TODO Auto-generated method stub
	}

}
