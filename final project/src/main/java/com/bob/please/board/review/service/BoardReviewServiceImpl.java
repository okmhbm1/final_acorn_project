package com.bob.please.board.review.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bob.please.board.review.dao.BoardReviewDao;

@Service
public class BoardReviewServiceImpl implements BoardReviewService{
	
	@Autowired
	private BoardReviewDao BoardReviewDao;
	
	@Override
	public void getList(HttpServletRequest request) {
	
		
	}

}
