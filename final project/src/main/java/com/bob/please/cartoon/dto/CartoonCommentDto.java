package com.bob.please.cartoon.dto;

public class CartoonCommentDto {
		   

	int cartoon_num;
	String userid;
	int point;
	String comment;
	String gender;
	int age;

	public CartoonCommentDto(){}
	public CartoonCommentDto(int cartoon_num, String userid, int point,String comment, String gender, int age) {
		super();
		this.cartoon_num = cartoon_num;
		this.userid = userid;
		this.point = point;
		this.gender = gender;
		this.age = age;
		this.comment=comment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCartoon_num() {
		return cartoon_num;
	}
	public void setCartoon_num(int cartoon_num) {
		this.cartoon_num = cartoon_num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
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
	
	

	}

