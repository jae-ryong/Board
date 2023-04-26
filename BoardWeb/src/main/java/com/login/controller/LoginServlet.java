package com.login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.service.BoardService;
import com.board.vo.BoardVO;
import com.login.service.LoginService;
import com.login.vo.LoginVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("userID");
		String pw = request.getParameter("userPW");
		LoginVO vo = new LoginVO();
		vo.setId(id);
		vo.setPw(pw);
		LoginService service = new LoginService();
		LoginVO loginVO = service.select(vo);
		//보드 리스트출력
		//BoardService boardservice = new BoardService();
		//List<BoardVO> boardVO = boardservice.select();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("Login", loginVO);
		
		//출력
		if(loginVO == null) {
			response.sendRedirect("login.html");
		}else {
			response.sendRedirect("list");
			
		}
	}

}
