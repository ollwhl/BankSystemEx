
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

/**
 * Servlet implementation class CloseServlet
 */
@WebServlet("/close")
public class CloseServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("/jsp/close.jsp");
    	disp.forward(request, response); 
	}

}
