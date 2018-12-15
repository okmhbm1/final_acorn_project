package com.bob.please.cartoon.dao;

import java.util.List;

import com.bob.please.cartoon.dto.CartoonDto;

public interface CartoonDao {

	public void selectall(CartoonDto dto);
	
	public List<CartoonDto> selectlist(CartoonDto dto);
	public CartoonDto selectdetail(int num);

	
	public void updatecategory(CartoonDto dto);
	
	public void insert(CartoonDto dto);
	public void insert2(CartoonDto dto);
}
