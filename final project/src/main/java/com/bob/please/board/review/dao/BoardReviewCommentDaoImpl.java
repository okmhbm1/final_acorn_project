package com.bob.please.board.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.board.review.dto.BoardReviewCommentDto;

@Repository
public class BoardReviewCommentDaoImpl implements BoardReviewCommentDao{
	@Autowired
	private SqlSession session;

	
	@Override
	public void insert(BoardReviewCommentDto dto) {
		session.insert("boardreviewcomment.insert", dto);
		
	}

	@Override
	public int getSequence() {
	
		return session.selectOne("boardreviewcomment.getSequence");
	}

	@Override
	public void update(BoardReviewCommentDto dto) {
	
		session.update("boardreviewcomment.update", dto);
	}

	@Override
	public List<BoardReviewCommentDto> getList(int ref_group) {
	
		return session.selectList("boardreviewcomment.getList", ref_group);
	}

	@Override
	public void delete(int num) {
	
		session.delete("boardreviewcomment.delete", num);
	}

}
