package in.ineuone.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mysearch = request.getParameter("search1");
		
//		response.sendRedirect("http://www.google.com");
		
		response.sendRedirect("http://www.google.com/search?q="+mysearch);
		
		
		// sequrity perpose k liye "RequestDispetcher" use krte hai sendRedirect ki jagah
		
		
	}

}
