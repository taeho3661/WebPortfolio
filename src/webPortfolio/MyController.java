package webPortfolio;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ItemDao;
import dao.UserDao;
import dto.ItemDto;
import dto.UserDto;



//serialVersionUID아이디값 부여해서 warning막음
//참고사이트 - https://hyeonstorage.tistory.com/253#	
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/", "*.do"}) // 두가지 패턴을 쓸거임
public class MyController extends HttpServlet{

	//	오버라이드 - 재정의
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//한글 깨지는거 방지
		request.setCharacterEncoding("UTF-8");
		
		String requestURI = request.getRequestURI(); 	// 전체 uri
		int cmdIdx = requestURI.lastIndexOf("/")+1; 	//  "/" 다음거부터 읽어옴
		String command = requestURI.substring(cmdIdx); 	// ex) "list.do"
		String jspPage = "";
		

		System.out.println("MyController_command :" + command);
		
		//시작페이지 임시설정
		if(command.equals("") || command.equals("/"))
		{
//			response.sendRedirect("/index.jsp");
			response.sendRedirect("/WebPortfolio/admin/memberList.do");
		}
		
		//memberList 회원 목록
		else if (command.equals("memberList.do"))
		{
			ArrayList<UserDto> list = UserDao.list();
			request.setAttribute("list", list);
			
			jspPage = "/admin/memberList.jsp";
		}
		
		//productList 상품 목록
		else if (command.equals("productList.do"))
		{
			ArrayList<ItemDto> list = ItemDao.list();
			request.setAttribute("list", list);
			
			jspPage = "/admin/productList.jsp";
		}
		
		//productAdd 상품 등록
		else if (command.equals("productAdd.do"))
		{
			jspPage = "/admin/productAdd.jsp";
		}
		else if (command.equals("productAddUpdate.do"))
		{
			System.out.println("123123123");
			String item_id = request.getParameter("item_id");
			int price = Integer.parseInt(request.getParameter("price"));
			int stock = Integer.parseInt(request.getParameter("stock"));
			String con_img = request.getParameter("con_img");
			
			ItemDao.add(item_id, price, stock, con_img);
			
			response.sendRedirect("productList.do");
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		if(!jspPage.equals(""))		// jsp페이지가 비어있지 않다면 
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher( jspPage ); // 페이지 이동 밀어줌
			dispatcher.forward(request, response);									//
		}
	}
	
}