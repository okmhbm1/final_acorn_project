package com.bob.please.board.anonymous.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bob.please.board.anonymous.dao.BoardAnonymousDao;



@Service
public class BoardAnonymousServiceImpl implements BoardAnonymousService{
	
	@Autowired
	private BoardAnonymousDao BoardAnonymousDao;
	@Autowired
	//private  BoardAnonymousCommentDao BoardAnonymousCommentDao;
	//한 페이지에 나타낼 row 의 갯수 
	static final int PAGE_ROW_COUNT=10;
		//하단 디스플레이 페이지 갯수 
	static final int PAGE_DISPLAY_COUNT=10;
	
	@Override
	public void getList(HttpServletRequest request) {
	
		
	}

}
