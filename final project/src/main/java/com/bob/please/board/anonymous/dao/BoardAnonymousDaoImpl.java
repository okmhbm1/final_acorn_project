package com.bob.please.board.anonymous.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardAnonymousDaoImpl implements BoardAnonymousDao{
	
	@Autowired
	private SqlSession session;
	
	
	
}
