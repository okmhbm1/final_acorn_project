package com.bob.please.member.dto;

public class MemberDto {
	private int num;
	private String userid;
	private String pwd;
	private String email;
	private String regdate;
	private String name;
	private String gender ;
	private int age ;
	public MemberDto() {}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MemberDto(int num, String userid, String pwd, String email, String regdate, String name, String gender,
			int age) {
		super();
		this.num = num;
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.regdate = regdate;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

}
