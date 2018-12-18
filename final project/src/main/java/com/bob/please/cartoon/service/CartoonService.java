package com.bob.please.cartoon.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dto.CartoonCommentDto;
import com.bob.please.cartoon.dto.CartoonDto;
import com.bob.please.cartoon.dto.CartoonLikeDto;
import com.bob.please.cartoon.dto.onelike_or_dislikeDto;

public interface CartoonService {
	
	  public void selectall(CartoonDto dto);
	 
	   public void selectlist(HttpServletRequest request);
	   public void selectdetail(ModelAndView mView, int num);
	
	
	   public void updatecategory(CartoonDto dto);
	
	
	public void insertcartoonpoint(CartoonCommentDto dto);
	
	public void selectcartoonpointlist(HttpServletRequest request);
	
	
	public void insert(CartoonDto dto);
	public void insert2(CartoonDto dto);
	
	public int is_selected(String userid); //댓글 추천/비추천시 이미 추천/비추천했는지 확인, 확인되면 추천/비추천 연산을 하면 안된다.
	public int is_recommend_selected(CartoonLikeDto dto); // 마찬가지로 만화 추천
	public void updategood(CartoonCommentDto dto);
	public void updatebad(CartoonCommentDto dto);
	
	public void set_selected(onelike_or_dislikeDto dto);
	
	// 만화 추천 처리
	public void insert_recomm(CartoonLikeDto dto);
	
	public void update_likes(int cartoon_num);
}
