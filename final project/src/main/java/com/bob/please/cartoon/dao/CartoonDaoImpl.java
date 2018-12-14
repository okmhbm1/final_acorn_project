package com.bob.please.cartoon.dao;

import java.util.List;

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
	   public List<CartoonDto> selectlist(CartoonDto dto) {
	      return session.selectList("cartoon.selectlist",dto);
	   }

	   @Override
	   public CartoonDto selectdetail(int num) {
	      return session.selectOne("cartoon.selectdetail",num);
	   }

	
	

	
	

	@Override
	public void insert(CartoonDto dto) {
		session.insert("cartoon.naver_insert",dto);
	}
	
	@Override
	public void insert2(CartoonDto dto) {
		session.insert("cartoon.naver_insert2",dto);
	}
}
