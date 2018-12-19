package com.bob.please.board.review.dao;

import java.util.List;

import com.bob.please.board.review.dto.BoardReviewCommentDto;


public interface BoardReviewCommentDao {
	public void insert(BoardReviewCommentDto dto);
	public int getSequence();
	public void update(BoardReviewCommentDto dto);
	public List<BoardReviewCommentDto> getList(int ref_group);
	public void delete(int num);
}
