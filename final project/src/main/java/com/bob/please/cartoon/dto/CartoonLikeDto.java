package com.bob.please.cartoon.dto;

public class CartoonLikeDto {
	int cartoon_num;
	String userid;
	int recommend;
	String gender;
	int age;
	
	public CartoonLikeDto() {}
	
	
	
	public CartoonLikeDto(int cartoon_num, String userid, int recommend, String gender, int age) {
		super();
		this.cartoon_num = cartoon_num;
		this.userid = userid;
		this.recommend = recommend;
		this.gender = gender;
		this.age = age;
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
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
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
