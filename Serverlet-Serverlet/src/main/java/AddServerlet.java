

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServerlet extends HttpServlet {
	
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int n1 = Integer.parseInt(request.getParameter("Num1"));
		int n2 = Integer.parseInt(request.getParameter("Num2"));
		int add = n1+n2;
		PrintWriter out = response.getWriter();
		response.sendRedirect("sq?add=" + add);
	}

}
