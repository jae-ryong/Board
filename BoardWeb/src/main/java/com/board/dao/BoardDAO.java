package com.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.board.vo.BoardVO;

public class BoardDAO {
	
	private SqlSession session;
	
	public BoardDAO() {
		
	}
	
	public BoardDAO(SqlSession session) {
		this.session = session;
	}

	public List<BoardVO> select() {
		List<BoardVO> list = null;
		list = session.selectList("example.Board.selectBoardList");
		return list;
	}

	public void insert(BoardVO vo) {
		session.insert("example.Board.insertBoardList",vo);
		session.commit();
	}

	public BoardVO select(BoardVO vo) {
		BoardVO vo2 = session.selectOne("example.Board.selectBoard",vo);
		return vo2;
	}

	public void delete(BoardVO vo) {
		session.delete("example.Board.delete",vo);
		session.commit();
	}

	public void update(BoardVO vo) {
		session.update("example.Board.update",vo);
		session.commit();
		
	}


	

}
