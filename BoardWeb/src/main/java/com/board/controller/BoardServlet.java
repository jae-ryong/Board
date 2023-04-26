package com.board.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.service.BoardService;
import com.board.vo.BoardVO;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/boardlist")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String contents = request.getParameter("contents");
		String dateString = request.getParameter("day");
		
		BoardVO vo = new BoardVO();
		vo.setBoard_title(title);
		vo.setBoard_author(author);
		vo.setBoard_date(dateString);
		vo.setBoard_contents(contents);
		
		BoardService service = new BoardService();
		service.insert(vo);
		response.sendRedirect("list");
//		List<BoardVO> boardVO = service.select();
//		
//		
//		RequestDispatcher rd = request.getRequestDispatcher("./boardList.jsp");
//
//		request.setAttribute("Board",boardVO);
//		rd.forward(request, response);
	}
}
