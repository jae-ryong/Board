package com.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.service.BoardService;
import com.board.vo.BoardVO;
import com.dat.service.DatService;
import com.dat.vo.DatVO;

/**
 * Servlet implementation class BoardDetailsServlet
 */
@WebServlet("/details")
public class BoardDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("board_number");
		int num = Integer.parseInt(name);
		BoardVO vo = new BoardVO();
		vo.setBoard_number(num);
		BoardService service = new BoardService();
		BoardVO vo2 = service.select(vo);
		
		//이건 Dat select
		//select
		DatVO datvo = new DatVO();
		datvo.setDat_number(num);
		DatService datService = new DatService();
		List<DatVO> a = datService.select(datvo);
		
		RequestDispatcher rd = request.getRequestDispatcher("./boardDetails.jsp");
		request.setAttribute("Dat", a);
		request.setAttribute("Board",vo2);
		rd.forward(request, response);
	}
}