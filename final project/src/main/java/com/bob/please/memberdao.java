package com.bob.please;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class memberdao {

	@Autowired
	private SqlSession session;

	
	public void insert(int num) {
		session.insert("member.select", num);
	}
}
