package com.dat.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.vo.BoardVO;
import com.dat.service.DatService;
import com.dat.vo.DatVO;

/**
 * Servlet implementation class DatListServlet
 */
@WebServlet("/datlist")
public class DatListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String author = request.getParameter("author");
		int number = Integer.parseInt(request.getParameter("number"));
		String comment = request.getParameter("comment");
		DatVO vo = new DatVO();
		vo.setDat_author(author);
		vo.setDat_coments(comment);
		vo.setDat_number(number);
		
		DatService service = new DatService();
		service.insert(vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("./boardDetails.jsp");
		
		rd.forward(request, response);
	}
}
