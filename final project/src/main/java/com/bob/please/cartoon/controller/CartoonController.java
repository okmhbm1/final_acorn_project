package com.bob.please.cartoon.controller;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
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
	public String home(ModelAndView mView) {
		
		return "home";
	}

	@RequestMapping("/crawling.do")
	public ModelAndView crawling(ModelAndView mView) {
	  
		 
		Document doc = null;
		CartoonDto dto=null;
		try {
		doc=Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	     String length="https://comic.naver.com/webtoon/list.nhn?titleId=701081&weekday=";
		System.out.println("fuck");
		//print all available links on page
	      Elements information = doc.select(".col_inner");
	      List <String> list=new ArrayList<String>();
	      for(Element l : information)
	      { 
	    	  Elements temp = l.select("li");
	    	  for(Element i : temp) {
	    		  dto = new CartoonDto();
	    		try {  
	    		dto.setDays(i.select("a[href]").attr("abs:href").substring(length.length()));
	    		System.out.println(i.select("img[alt]").attr("abs:alt").substring(32));
	    		dto.setTitle(i.select("img[alt]").attr("abs:alt").substring(32));
	    		dto.setImage_url(i.select("img[src]").attr("abs:src"));
	    		System.out.println("a: " +i.select("a[href]").attr("abs:href"));
	  	        //System.out.println("img: " +i.select("img[src]").attr("abs:src"));
	  	        //System.out.println("title: " +i.select("img[alt]").attr("abs:alt").substring(32));
	  	        //System.out.println("days: " +i.select("a[href]").attr("abs:href").substring(length.length()));
	  	        doc=Jsoup.connect(i.select("a[href]").attr("abs:href")).get();
	    		Elements info=doc.select(".wrt_nm");
	    		dto.setPainter(info.text());
	    		Elements info2=doc.select(".detail").select("p");
	    		dto.setDescription(info2.text());
	    		}catch(Exception e) {
	    			
	    		}
	    		service.insert(dto);
	    		
	    		  System.out.println("");
	    	  }
	         	      }

      mView.setViewName("crawling");
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
