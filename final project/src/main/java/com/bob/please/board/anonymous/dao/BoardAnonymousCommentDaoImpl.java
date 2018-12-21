package com.bob.please.board.anonymous.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.board.anonymous.dto.BoardAnonymousCommentDto;

@Repository
public class BoardAnonymousCommentDaoImpl implements BoardAnonymousCommentDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(BoardAnonymousCommentDto dto) {
		session.insert("boardanonymouscomment.insert", dto);
		
	}

	@Override
	public int getSequence() {
		return session.selectOne("boardanonymouscomment.getSequence");
	
	}

	@Override
	public void update(BoardAnonymousCommentDto dto) {
	
		session.update("boardreviewcomment.update", dto);
	}

	@Override
	public List<BoardAnonymousCommentDto> getList(int ref_group) {
		
		return session.selectList("boardanonymouscomment.getList", ref_group);
	}

	@Override
	public void delete(int num) {
		
		session.delete("boardanonymouscomment.delete", num);
	}

}
