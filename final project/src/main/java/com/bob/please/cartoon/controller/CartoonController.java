package com.bob.please.cartoon.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dto.CartoonDto;
import com.bob.please.cartoon.service.CartoonService;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 


@Controller
public class CartoonController {
	
	@Autowired
	CartoonService service;
	
	@RequestMapping("/home.do")
	public ModelAndView home(ModelAndView mView) {
		String url="https://www.naver.com/";
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		Elements element = doc.select("title");
		
		String title=element.text();
		System.out.println(element.text());
		System.out.println("뭐지");
		mView.addObject("title", title);
		mView.setViewName("home");
		
		return mView;
		
	}
	
	@RequestMapping("/detail.do")
	public String detail() {
		
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
