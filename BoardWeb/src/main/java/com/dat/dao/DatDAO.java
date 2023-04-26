package com.dat.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dat.vo.DatVO;

public class DatDAO {
	private SqlSession session;

	public DatDAO(SqlSession session) {
		this.session=session;
	}

	public void insert(DatVO vo) {
		session.insert("example.Dat.insert",vo);
		session.commit();
	}

	public List<DatVO> select(DatVO datvo) {
		List<DatVO> list = null;
		list = session.selectList("example.Dat.select",datvo);
		return list;
	}
}
