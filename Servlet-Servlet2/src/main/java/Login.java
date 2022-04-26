
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class Login extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String uName=request.getParameter("uName");  
    String uPass=request.getParameter("uPass");  
          
    if(uName.equals("w3adda") && uPass.equals("123456")){  
        RequestDispatcher rd=request.getRequestDispatcher("Home");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Wrong User Name and Password!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }        
    }   
   }
