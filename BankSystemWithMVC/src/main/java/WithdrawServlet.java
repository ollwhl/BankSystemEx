/*
+=====================================+
|       Name: Wan FuRin               |
| StudentNum: 316541                  |
|     Lesson: 04                      |
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
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/withdraw")
public class WithdrawServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        RequestDispatcher disp=null;
        if (session.isNew()){
        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
        }else{
            String name=(String) session.getAttribute("name");
            request.setAttribute("name", name);
        	disp=request.getRequestDispatcher("/jsp/withdraw.jsp");
        	
        }
    	disp.forward(request, response); 
	}
}
