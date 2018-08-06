package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.lprod.service.LprodServiceInf;

/**
 * Servlet implementation class LprodServlet
 */
@WebServlet("/lprodList")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LprodServiceInf lprodService = new LprodService();
		
		String pageStr 		= request.getParameter("page");
		String pageSizeStr 	= request.getParameter("pageSize");
		
		int page 	 = pageStr 	   == null ? 1 : Integer.parseInt(pageStr);
		int pageSize = pageSizeStr == null ? 5 : Integer.parseInt(pageSizeStr);
		
		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("page", page);
		pageMap.put("pageSize", pageSize);
		
		Map<String, Object> lprodMap = lprodService.getPageLprodList(pageMap);
		String pageResult = (String) lprodMap.get("pageResult");				//페이지 규모 생성
		List<LprodVo> lprodlist = (List<LprodVo>) lprodMap.get("pageList");		//페이지에 담을 상품분류 정보
		request.setAttribute("lprodlist", lprodlist);
		request.setAttribute("pageResult", pageResult);
		
		RequestDispatcher rd = request.getRequestDispatcher("/lprod/lprodList.jsp");
		rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
