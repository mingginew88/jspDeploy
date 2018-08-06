package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SumCalculation
 */
@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String startStr = request.getParameter("start");
		int startNum = Integer.parseInt(startStr);
		
		String endStr = request.getParameter("end");
		int endNum = Integer.parseInt(endStr);
		
		int sum = 0;
		if(startNum > endNum) {
			System.out.println("시작값이 종료값보다 크네요. \n 다시 입력해주세요.");
//			response.sendRedirect("/jsp/sumInput.jsp");
			request.getRequestDispatcher("/jsp/sumInput.jsp").forward(request, response);
		} else {
			for (int i = startNum; i <= endNum; i++) {
				sum += i;
			}
			System.out.println("시작값 : " + startNum + "  종료값 : " + endNum + "  총 합계 : " +sum);
		}
		
		//request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
		//request객체에 일시적으로 값을 저장하는 방법
		request.setAttribute("sumResult", sum);
		
		//session에 sumResult를 저장한다.
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", sum);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
		rd.forward(request, response);
		
		
		
		
	}//End doPost()

}
