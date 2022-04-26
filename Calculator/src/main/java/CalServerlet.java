

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalServerlet")
public class CalServerlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String op = request.getParameter("op");
		
		switch(op) 
		{
		 case "Addition" : out.println("Answer=" +(Integer.parseInt(n1) + (Integer.parseInt(n2))));
		 break;
		 
		 case "Substraction" : out.println("Answer=" +(Integer.parseInt(n1) - (Integer.parseInt(n2))));
		 break;
		 
		 case "Multiplication" : out.println("Answer=" +(Integer.parseInt(n1) * (Integer.parseInt(n2))));
		 break;
		 
		 case "Division" : out.println("Answer=" +(Integer.parseInt(n1) / (Integer.parseInt(n2))));
		 break;
		 
		 default : out.println("Incorrect Answer");
		}
	}

}
