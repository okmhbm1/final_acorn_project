package com.bob.please.board.anonymous.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.board.anonymous.dto.BoardAnonymousDto;
import com.bob.please.board.review.dto.BoardReviewDto;

@Repository
public class BoardAnonymousDaoImpl implements BoardAnonymousDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public int getCount(BoardAnonymousDto dto) {
		
		return session.selectOne("boardanonymous.getCount", dto);
	}

	@Override
	public void insert(BoardAnonymousDto dto) {
		session.insert("boardanonymous.insert", dto);
		
	}

	@Override
	public List<BoardAnonymousDto> getList(BoardAnonymousDto dto) {
		return session.selectList("boardanonymous.getList", dto);
	}

	@Override
	public void addViewCount(int num) {
		session.update("boardanonymous.addViewCount", num);
	}

	@Override
	public BoardAnonymousDto getData(BoardAnonymousDto dto) {
		return session.selectOne("boardanonymous.getData2", dto);
	}

	@Override
	public void delete(int num) {
		session.delete("boardanonymous.delete", num);
		
	}

	@Override
	public BoardAnonymousDto getData(int num) {
		
		return session.selectOne("boardanonymous.getData", num);
	}

	@Override
	public void update(BoardAnonymousDto dto) {
		
		session.update("boardanonymous.update", dto);
	}

}

	
	
	

