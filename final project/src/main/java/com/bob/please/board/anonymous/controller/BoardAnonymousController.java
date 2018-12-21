package com.bob.please.board.anonymous.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bob.please.board.anonymous.dto.BoardAnonymousDto;
import com.bob.please.board.anonymous.service.BoardAnonymousService;





@Controller
public class BoardAnonymousController {

	@Autowired
	private BoardAnonymousService service;
	
	@RequestMapping("/board_anonymous/list")
	public ModelAndView getList(HttpServletRequest request) {
		//HttpServletRequest 객체를 전달해서 필요한 모델이 담기게 한다. 
		service.getList(request);
		//view 페이지로 forward 이동해서 글 목록 출력하기 
		return new ModelAndView("board_anonymous/list");
	}
	@RequestMapping("/board_anonymous/insertform")
	public ModelAndView Insertform(HttpServletRequest request) {
		//view 페이지로 forward 이동해서 새글 작성 폼 출력하기 
		return new ModelAndView("board_anonymous/insertform");
	}
	@RequestMapping("/board_anonymous/insert")
	public ModelAndView Insert(@ModelAttribute BoardAnonymousDto dto,HttpServletRequest request) {
		
		String id=(String)request.getSession().getAttribute("id");
		dto.setWriter(id);
		//새글을 저장한다. 
		service.saveContent(dto);
		//글 목록 보기로 리다일렉트 이동
		return new ModelAndView("redirect:/board_anonymous/list.do");
	}
}

	
	

