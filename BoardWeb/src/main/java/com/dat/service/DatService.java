package com.dat.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.board.vo.BoardVO;
import com.dat.dao.DatDAO;
import com.dat.vo.DatVO;
import com.util.mybatis.MyBatisConnection;

public class DatService {
	private static SqlSessionFactory factory = MyBatisConnection.getSqlSessionFactory();
	SqlSession session=factory.openSession();
	public void insert(DatVO vo) {
		DatDAO dao = new DatDAO(session);
		dao.insert(vo);
		
	}
	
	
	public List<DatVO> select(DatVO datvo) {
		DatDAO dao = new DatDAO(session);
		List<DatVO> list = dao.select(datvo);
		return list;
	}
}
