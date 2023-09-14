package com.java_advance;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/RegistrationServlet")
	public class RegistrationServlet extends HttpServlet {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Get form parameters
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        // Add your registration logic here
	        
	        // For example, you can print the values to console
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	        
	        // You can add your database code or any other registration logic here
	        
	        // Send a response back to the client
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Registration Successful</h1>");
	        out.println("<p>Username: " + username + "</p>");
	        out.println("<p>Password: " + password + "</p>");
	        out.println("</body></html>");
	    }
	}


