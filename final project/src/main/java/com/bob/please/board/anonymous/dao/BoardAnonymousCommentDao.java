package com.bob.please.board.anonymous.dao;

import java.util.List;

import com.bob.please.board.anonymous.dto.BoardAnonymousCommentDto;

public interface BoardAnonymousCommentDao {
	public void insert(BoardAnonymousCommentDto dto);
	public int getSequence();
	public void update(BoardAnonymousCommentDto dto);
	public List<BoardAnonymousCommentDto> getList(int ref_group);
	public void delete(int num);
}
