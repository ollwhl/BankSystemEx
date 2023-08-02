
/*
+=====================================+
|       Name: Wan FuRin               |
| StudentNum: 316541                  |                    |
+=====================================+
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/balance")
public class BalanceServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name=(String) session.getAttribute("name");
        RequestDispatcher disp=null;
        if (session.isNew()){
        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
        }else{
        	disp=request.getRequestDispatcher("/jsp/balance.jsp");
        }
		 
    	disp.forward(request, response); 
	}

}
