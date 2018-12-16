package com.bob.please.cartoon.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dto.CartoonCommentDto;
import com.bob.please.cartoon.dto.CartoonDto;

public interface CartoonService {
	
	  public void selectall(CartoonDto dto);
	 
	   public void selectlist(HttpServletRequest request);
	   public void selectdetail(ModelAndView mView, int num);
	
	
	   public void updatecategory(CartoonDto dto);
	
	
	public void insertcartoonpoint(CartoonCommentDto dto);
	
	public void selectcartoonpointlist(HttpServletRequest request);
	
	
	void insert(CartoonDto dto);
	void insert2(CartoonDto dto);
}
