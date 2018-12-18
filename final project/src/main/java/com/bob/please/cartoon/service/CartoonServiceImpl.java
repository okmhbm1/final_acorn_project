package com.bob.please.cartoon.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dao.CartoonDao;
import com.bob.please.cartoon.dto.CartoonCommentDto;
import com.bob.please.cartoon.dto.CartoonDto;
import com.bob.please.cartoon.dto.CartoonLikeDto;
import com.bob.please.cartoon.dto.onelike_or_dislikeDto;

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
	      int hit=dao.updatehit(num);
	      
	      mView.addObject("hit",hit);
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




	@Override
	public void insertcartoonpoint(CartoonCommentDto dto) {
		// TODO Auto-generated method stub
		dao.insertcartoonpoint(dto);
	}




	@Override
	public void selectcartoonpointlist(HttpServletRequest request) {
		CartoonCommentDto dto=new CartoonCommentDto();
		dto.setCartoon_num(Integer.parseInt(request.getParameter("num")));
		List<CartoonCommentDto> list = dao.selectcartoonpointlist(dto);
		request.setAttribute("list", list);
	}




	@Override
	public int is_selected(String userid) {
		
		return dao.is_selected(userid);
	}




	@Override
	public void updategood(CartoonCommentDto dto) {
	
		dao.updategood(dto);
		
	}




	@Override
	public void set_selected(onelike_or_dislikeDto dto) {
		dao.set_selected(dto);
		
	}




	@Override
	public void updatebad(CartoonCommentDto dto) {
		dao.updatebad(dto);
		
	}




	@Override
	public int is_recommend_selected(CartoonLikeDto dto) {
		
		return dao.is_recommend_selected(dto);
	}




	@Override
	public void insert_recomm(CartoonLikeDto dto) {
		dao.insert_recomm(dto);
		
	}




	@Override
	public void update_likes(int cartoon_num) {
		dao.update_likes(cartoon_num);
	}




	
	
}
