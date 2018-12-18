package com.bob.please.cartoon.dto;

public class onelike_or_dislikeDto {
	int cartoon_num;
	String userid;
	int is_selected;
	public onelike_or_dislikeDto() {}
	
	
	
	public onelike_or_dislikeDto(int cartoon_num, String userid, int is_selected) {
		super();
		this.cartoon_num = cartoon_num;
		this.userid = userid;
		this.is_selected = is_selected;
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
	public int getIs_selected() {
		return is_selected;
	}
	public void setIs_selected(int is_selected) {
		this.is_selected = is_selected;
	}
	
	
}
