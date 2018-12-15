package com.bob.please.cartoon.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dao.CartoonDao;
import com.bob.please.cartoon.dto.CartoonDto;

@Service
public class CartoonServiceImpl implements CartoonService{
	
	@Autowired
	CartoonDao dao;
	
	


	
	
	 @Override
	   public void selectall(CartoonDto dto) {
	   
	      dao.selectall(dto);
	   }




	   @Override
	   public void selectlist(HttpServletRequest request) {
	      CartoonDto dto = new CartoonDto();
	      String days = request.getParameter("days");
	      String title = request.getParameter("title");
	      String image_url = request.getParameter("image_url");
	      dto.setImage_url(image_url);
	      dto.setDays(days);
	      dto.setTitle(title);
	      List<CartoonDto> list=dao.selectlist(dto);
	      request.setAttribute("list", list);
	   }


	   @Override
	   public void selectdetail(ModelAndView mView, int num) {
	      CartoonDto dto =dao.selectdetail(num);
	      mView.addObject("dto",dto);
	      

	   }
	
	
	
	
	@Override
	public void updatecategory(CartoonDto dto) {
		
		dao.updatecategory(dto);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void insert(CartoonDto dto) {
		dao.insert(dto);
		
	}

	@Override
	public void insert2(CartoonDto dto) {
		dao.insert2(dto);
		
	}
	
	
}
