package com.bob.please.board.review.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bob.please.board.review.dto.BoardReviewDto;

public interface BoardReviewService {
	public void getList(HttpServletRequest request);
	public void saveContent(BoardReviewDto dto);
	public void getDetail(HttpServletRequest request);
	public void deleteContent(int num);
}
