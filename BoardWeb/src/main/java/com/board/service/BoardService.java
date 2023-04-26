package com.board.service;

import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.board.dao.BoardDAO;
import com.board.vo.BoardVO;
import com.login.dao.LoginDAO;
import com.login.vo.LoginVO;
import com.util.mybatis.MyBatisConnection;

public class BoardService {
	private static SqlSessionFactory factory = MyBatisConnection.getSqlSessionFactory();
	SqlSession session=factory.openSession();
	

	public List<BoardVO> select() {
		BoardDAO dao = new BoardDAO(session);
		List<BoardVO> list = dao.select();
		return list;
	}


	public void insert(BoardVO vo) {
		BoardDAO dao = new BoardDAO(session);
		dao.insert(vo);
	}


	public BoardVO select(BoardVO vo) {
		BoardDAO dao1 = new BoardDAO(session);
		BoardVO vo1 = dao1.select(vo);
		return vo1;
	}


	public void delete(BoardVO vo) {
		BoardDAO dao2 = new BoardDAO(session);
		dao2.delete(vo);
	}


	public void update(BoardVO vo) {
		BoardDAO dao3 = new BoardDAO(session);
		dao3.update(vo);
		
	}

	
	
}
