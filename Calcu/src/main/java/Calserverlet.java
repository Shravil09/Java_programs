import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/calculator"})
public class Calserverlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
                String n1 = request.getParameter("txt1");
                String n2 = request.getParameter("txt2");
                String op = request.getParameter("op");                
        switch (op) {
            case "Addition":
                out.println("Answer = "+(Integer.parseInt(n1) + Integer.parseInt(n2)));
                break;
            case "Subtraction":
                out.println("Answer = "+(Integer.parseInt(n1) - Integer.parseInt(n2)));
                break;
            case "multiplication":
                out.println("Answer = "+(Integer.parseInt(n1) * Integer.parseInt(n2)));
                break;
            default:
                out.println("Answer = "+(Integer.parseInt(n1) / Integer.parseInt(n2)));
                break;
        } 
        
    }
}
