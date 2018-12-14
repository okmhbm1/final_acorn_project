package com.bob.please.board.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.board.review.dto.BoardReviewDto;

@Repository
public class BoardReviewDaoImpl implements BoardReviewDao{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<BoardReviewDto> getList(BoardReviewDto dto) {
	
		return session.selectList("boardreview.getList", dto);
	}

	@Override
	public void insert(BoardReviewDto dto) {
		
		session.insert("boardreview.insert", dto);
		
	}

	@Override
	public int getCount(BoardReviewDto dto) {
		
		return session.selectOne("boardreview.getCount", dto);
	}

}
