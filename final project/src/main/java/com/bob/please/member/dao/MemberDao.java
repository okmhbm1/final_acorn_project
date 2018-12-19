package com.bob.please.member.dao;

import com.bob.please.member.dto.MemberDto;

public interface MemberDao {
	//회원정보를 DB 에 INSERT 하는 메소드
	public void insert(MemberDto dto);
	//유효한 정보인지 리턴해주는 메소드
	public boolean isValid(MemberDto dto);
	//인자로 전달된 아이디가 이미 DB에 존재하는지 여부를 리턴하는 메소드
	public boolean isExist(String inputId);
	//인자로 전달된 아이디에 해당하는 개인정보를 리턴해주는 메소드
	public MemberDto getData(String id);
	//회원정보를 수정반영하는 메소드
	public void update(MemberDto dto);
	//회원정보를 삭제하는 메소드 
	public void delete(String id);
	//아이디에 해당하는 비밀번호 hash 값을 리턴해주는 메소드
	public String getPwdHash(String id);
	//비밀번호 수정하는 메소드
	public void updatePwd(MemberDto dto);
}