package com.bob.please.board.anonymous.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/board_anonymous/detail")
	public ModelAndView detail(HttpServletRequest request) {
		service.getDetail(request);
		return new ModelAndView("board_anonymous/detail");
	}
	@RequestMapping("/board_anonymous/delete")
	public ModelAndView Delete(@RequestParam int num, HttpServletRequest request) {
		service.deleteContent(num);
		return new ModelAndView("redirect:/board_anonymous/list.do");
	}
	@RequestMapping("/board_anonymous/updateform")
	public ModelAndView UpdateForm(ModelAndView mView, @RequestParam int num, 
			HttpServletRequest request) {
		service.getUpdateData(mView, num);
		mView.setViewName("board_anonymous/updateform");
		return mView;
	}
	@RequestMapping("/board_anonymous/update")
	public ModelAndView Update(@ModelAttribute BoardAnonymousDto dto,HttpServletRequest request) {
		//서비스를 이용해서 글을 수정반영하고
		service.updateContent(dto);
		//dto 에 담긴 글 번호를 이용해서 글자세히 보기로 리다일렉트 이동시킨다.
		return new ModelAndView("redirect:/board_anonymous/detail.do?num="+dto.getNum());
	}
	@RequestMapping("/board_anonymous/comment_insert")
	public ModelAndView CommentInsert(@RequestParam int ref_group, HttpServletRequest request) {
		//서비스를 이용해서 새 댓글을 저장하고 
		service.saveComment(request);
		//ref_group 은 원글의 글번호 이다. (댓글의 그룹번호)
		return new ModelAndView("redirect:/board_anonymous/detail.do?num="+ref_group);
	}
	
}

	
	

