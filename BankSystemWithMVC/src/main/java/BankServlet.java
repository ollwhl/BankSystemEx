

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
 * Servlet implementation class BankServlet
 */
@WebServlet("/bank")
public class BankServlet extends HttpServlet {
    ExtendedBank bank=new ExtendedBank();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String command =request.getParameter("command");
	    int result;
	    if(command.equals("open")){
	    	String name = request.getParameter("name");
	    	String pw1 = request.getParameter("password");
	    	String pw2 = request.getParameter("comfirmPassword");
	    	result=bank.open(name,pw1,pw2);
	        String sresult=String.valueOf(result);
	        request.setAttribute("result",sresult );
	        RequestDispatcher disp=request.getRequestDispatcher("/jsp/openResult.jsp");
	    	disp.forward(request, response); 
	    }else if(command.equals("close")) {
	    	HttpSession session = request.getSession();
	        RequestDispatcher disp=null;
	        if (session.isNew()){
	        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
	        }else{
	        	String name=(String) session.getAttribute("name");
	        	String password = request.getParameter("password");
	        	result=bank.login(name, password);
	        	if(result==0) {
	        		result=bank.close(name);
	        	}
		        String sresult=String.valueOf(result);
		        request.setAttribute("name", name);
		        request.setAttribute("result",sresult );
		        disp=request.getRequestDispatcher("/jsp/closeResult.jsp");
		    	disp.forward(request, response); 
	        }
	    }else if(command.equals("withdraw")) {
	    	HttpSession session = request.getSession();
	        RequestDispatcher disp=null;
	        if (session.isNew()){
	        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
	        }else{
	        	String name=(String) session.getAttribute("name");
		    	String amount= request.getParameter("amount");
		    	result=bank.withdraw(name, amount);
		    	if(result==0)
		    		result=bank.showBalance(name);
		        String sresult=String.valueOf(result); 
		        String samount=String.valueOf(amount);
	        	request.setAttribute("name", name);
		        request.setAttribute("result",sresult);
		        request.setAttribute("amount",samount);
		        disp=request.getRequestDispatcher("/jsp/withdrawResult.jsp");
	        }
	    	disp.forward(request, response);  
	    }else if(command.equals("deposit")) {
	    	HttpSession session = request.getSession();
	        RequestDispatcher disp=null;
	        if (session.isNew()){
	        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
	        }else{
	        	String name=(String) session.getAttribute("name");
		    	String amount= request.getParameter("amount");
		    	result=bank.deposit(name, amount);
		    	if(result==0)
		    		result=bank.showBalance(name);
		        String sresult=String.valueOf(result); 
		        String samount=String.valueOf(amount);
	        	request.setAttribute("name", name);
		        request.setAttribute("result",sresult);
		        request.setAttribute("amount",samount);
		        disp=request.getRequestDispatcher("/jsp/depositResult.jsp");
	        }
	    	disp.forward(request, response); 
	    }else if(command.equals("balance")) {
	    	HttpSession session = request.getSession();
	        RequestDispatcher disp=null;
	        if (session.isNew()){
	        	disp=request.getRequestDispatcher("/jsp/sessionOut.jsp");
	        }else{
	        	String name=(String) session.getAttribute("name");
	        	result=bank.showBalance(name);
	        	String sresult=String.valueOf(result);
	        	request.setAttribute("name", name);
	        	request.setAttribute("result",sresult );
	        	disp=request.getRequestDispatcher("/jsp/balanceResult.jsp");
	        	disp.forward(request, response); 
	        }
	    }else if(command.equals("login")) {
	    	HttpSession session = request.getSession();
	    	RequestDispatcher disp = null;
	    	if(session.isNew()) {
		    	String name = request.getParameter("name");
		    	String password = request.getParameter("password");
		    	result=bank.login(name, password);
		    	if(result==0) {
		            session.setAttribute("name",name);
		    		request.setAttribute("name", name);
		    		disp=request.getRequestDispatcher("/jsp/home.jsp");
		    	}else{
		    		session.invalidate();
		    		String sresult=String.valueOf(result);
		    		request.setAttribute("result",sresult );
		    		disp=request.getRequestDispatcher("/jsp/loginFail.jsp");
		    	}
	    	}else {
	    		String name=(String) session.getAttribute("name");
	    		request.setAttribute("name", name);
	    		disp=request.getRequestDispatcher("/jsp/home.jsp");
	    	}
	    	if(disp!=null) {
	    		disp.forward(request, response); 
	    	}
	    }else if(command.equals("logout")) {
	        HttpSession session = request.getSession();
	        session.removeAttribute("name");
	        session.invalidate();
	        RequestDispatcher disp=request.getRequestDispatcher("/jsp/logout.jsp");
	    	disp.forward(request, response); 
	    }
	}
}