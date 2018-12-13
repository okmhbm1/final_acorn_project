package com.bob.please.cartoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


	
	
}
