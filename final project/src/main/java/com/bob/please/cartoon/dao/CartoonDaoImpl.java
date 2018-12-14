package com.bob.please.cartoon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.cartoon.dto.CartoonDto;

@Repository
public class CartoonDaoImpl implements CartoonDao {

	@Autowired
	SqlSession session;
	
	@Override
	public void selectall(CartoonDto dto) {
		session.selectList("cartoon.selectall", dto);
	}

	@Override
	public void insert(CartoonDto dto) {
		session.insert("cartoon.naver_insert",dto);
	}
}
