package com.login.dao;

import org.apache.ibatis.session.SqlSession;

import com.login.vo.LoginVO;

public class LoginDAO {
	
	private SqlSession session;
	
	public LoginDAO() {
	}
	
	public LoginDAO(SqlSession session) {
		this.session=session;
	}

	public LoginVO select(LoginVO vo) {
		vo = session.selectOne("example.Login.selectLogin", vo);
		return vo;
	}

}
