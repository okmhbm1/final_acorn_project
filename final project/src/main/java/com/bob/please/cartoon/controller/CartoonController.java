package com.bob.please.cartoon.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bob.please.cartoon.dto.CartoonDto;
import com.bob.please.cartoon.service.CartoonService;

@Controller
public class CartoonController {
	
	@Autowired
	CartoonService service;
	
	@RequestMapping("/detail.do")
	public String home(Locale locale, Model model) {
		
		return "detail";
	}
	@RequestMapping("/insertform.do")
	public String insertform(CartoonDto dto) {
		service.selectall(dto);
		return "insertform";
	}
	@RequestMapping("/list.do")
	public String list(CartoonDto dto) {
		service.selectall(dto);
		return "list";
	}
}
