

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		
		
		
		/*int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));*/
	    int add=(int)request.getAttribute("add");
	    add= add*add;
	    out.print("Result is = "+add);  
	
	}
}
