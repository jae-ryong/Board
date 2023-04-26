package com.login.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.login.dao.LoginDAO;
import com.login.vo.LoginVO;
import com.util.mybatis.MyBatisConnection;

public class LoginService {
	
	private static SqlSessionFactory factory = MyBatisConnection.getSqlSessionFactory();
	SqlSession session=factory.openSession();
	
	public LoginVO select(LoginVO vo) {
		LoginDAO loginDAO = new LoginDAO(session);
		vo = loginDAO.select(vo);
		return vo;
	}

	

}
