package com.bob.please.board.anonymous.dao;

import java.util.List;

import com.bob.please.board.anonymous.dto.BoardAnonymousDto;


public interface BoardAnonymousDao {

	public int getCount(BoardAnonymousDto dto);
	public void insert(BoardAnonymousDto dto);
	public List<BoardAnonymousDto> getList(BoardAnonymousDto dto);
}
