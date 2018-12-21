package com.bob.please.board.anonymous.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.bob.please.board.anonymous.dto.BoardAnonymousCommentDto;
import com.bob.please.board.anonymous.dto.BoardAnonymousDto;



public interface BoardAnonymousService {
	public void getList(HttpServletRequest request);
	public void saveContent(BoardAnonymousDto dto);
	public void getDetail(HttpServletRequest request);
	public void deleteContent(int num);
	public void getUpdateData(ModelAndView mView, int num);
	public void updateContent(BoardAnonymousDto dto);
	
	public void saveComment(HttpServletRequest request);
	public void updateComment(BoardAnonymousCommentDto dto);
	public void deleteComment(int num);
	
}
