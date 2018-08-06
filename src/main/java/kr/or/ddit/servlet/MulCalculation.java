package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MulCalculation
 */
@WebServlet("/mulCalculation")
public class MulCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strParam1 = request.getParameter("param1");
		String strParam2 = request.getParameter("param2");
		
		int numParam1 = Integer.parseInt(strParam1);
		int numParam2 = Integer.parseInt(strParam2);
		int mulResult = numParam1 * numParam2;
		
		System.out.println(mulResult);
	}

}
