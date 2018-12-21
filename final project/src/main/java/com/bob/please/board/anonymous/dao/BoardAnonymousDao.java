package com.bob.please.board.anonymous.dao;

import java.util.List;

import com.bob.please.board.anonymous.dto.BoardAnonymousDto;
import com.bob.please.board.review.dto.BoardReviewDto;


public interface BoardAnonymousDao {

	public int getCount(BoardAnonymousDto dto);
	public void insert(BoardAnonymousDto dto);
	public List<BoardAnonymousDto> getList(BoardAnonymousDto dto);
	public void addViewCount(int num);
	public BoardAnonymousDto getData(BoardAnonymousDto dto);
	public void delete(int num);
	public BoardAnonymousDto getData(int num);
	public void update(BoardAnonymousDto dto);
	
	
}
