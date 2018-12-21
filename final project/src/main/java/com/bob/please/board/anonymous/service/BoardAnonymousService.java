package com.bob.please.board.anonymous.service;

import javax.servlet.http.HttpServletRequest;

import com.bob.please.board.anonymous.dto.BoardAnonymousDto;



public interface BoardAnonymousService {
	public void getList(HttpServletRequest request);
	public void saveContent(BoardAnonymousDto dto);
}
