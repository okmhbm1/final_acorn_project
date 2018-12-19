package com.bob.please.member.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.bob.please.member.dto.MemberDto;


public interface MemberService {
	//회원 정보를 추가하는 비즈니스 로직을 수행하는 메소드 형태 정의하기
	public void addUser(ModelAndView mView, MemberDto dto);
	//로그인 처리를 하는 메소드
	public void validUser(HttpSession session, ModelAndView mView, MemberDto dto);
	//아이디 사용가능 여부를 Map 에 담아서 리턴하는 로직 처리
	public Map<String, Object> canUseId(String inputId);
	//개인정보를 보여주기 위한 비즈니스 로직 처리
	public void showInfo(HttpSession session, ModelAndView mView);
	//개인정보 수정반영하는 메소드
	public void updateUser(MemberDto dto);
	//개인정보 삭제하는 메소드
	public void deleteUser(HttpSession session);
	//비밀번호 수정반영하는 메소드
	public void updatePwd(HttpServletRequest request);
}