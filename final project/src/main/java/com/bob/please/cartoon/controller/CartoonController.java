package com.bob.please.cartoon.controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bob.please.cartoon.dto.CartoonCommentDto;
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
	    		dto.setDetail_uri(i.select("a[href]").attr("abs:href"));
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

	
	
	@RequestMapping("/crawling2.do")
	public ModelAndView crawling2(ModelAndView mView) {
	  
		 
		Document doc = null;
		CartoonDto dto=null;
		try {
		doc=Jsoup.connect("http://www.zzamtoon.com/webtoon/weekly_all").get();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("fuck");
		//print all available links on page
	      Elements header = doc.select(".header");
	      Elements body = doc.select(".body");
	      String days[] = new String[header.size()];
	      int i=0;
	      for(Element l: header)
	      {
	    	  System.out.println("요일 : "+l.select("strong").text());
	    	  days[i]=l.select("strong").text();
	    	  i++;
	      }
	      i=0;
	      for(Element l : body)
	      {
	    	  
	    	  Elements li = l.select("li");
	    	  for(Element j : li ) {
	    		  System.out.println("detail : " + j.select("a[href]").attr("abs:href"));  //detail
	    		  try {
	    		  doc=Jsoup.connect(j.select("a[href]").attr("abs:href")).get();
	    		  System.out.println(j.select("a[href]").attr("abs:href"));
	    		  }catch(Exception e)
	    		  {
	    			  e.printStackTrace();
	    		  }
	    		  
	    		  System.out.println("detail: "+doc.select(".summary").text());
	    		  
	    		  dto=new CartoonDto();
	    		  dto.setPainter(doc.select("p").select(".text-gray").select("span").text().replaceAll("글/그림 : ",""));
	    		  dto.setDays(days[i]);
	    		  dto.setDetail_uri(j.select("a[href]").attr("abs:href"));
	    		  dto.setDescription(doc.select(".summary").text());
	    		  dto.setImage_url(j.select(".img-fluid").attr("abs:src"));
	    		  dto.setTitle("title: "+j.select(".title").text().replaceAll("title:", ""));
	    		  dto.setCategory(j.select(".cate").text());
	    		  service.insert2(dto);
	    		  System.out.println("img : "+j.select(".img-fluid").attr("abs:src")); //img 주소
	    		  System.out.println("title: "+j.select(".title").text());
	    		  System.out.println("장르: "+j.select(".cate").text());
	    	  }
	    	  i++;
	    	  
	      }
	      i=0;
  	
   		
	    		  System.out.println("");
	    	  
	         	      

	  
      mView.setViewName("crawling");
      return mView;
			   

	}

	@RequestMapping("/sort.do")
	@ResponseBody
	   public String sort(@RequestParam String [] cartoon, @RequestParam String category,ModelAndView mView) {
	      CartoonDto dto=null;
		  for(int i=0; i< cartoon.length;i++)
	      {	
			dto=new CartoonDto();
			dto.setNum(Integer.parseInt(cartoon[i]));
			dto.setCategory(category);
			System.out.println(dto.getNum());
			System.out.println(dto.getCategory());
			service.updatecategory(dto);
			System.out.println("여기실행?");
	      }

	      return "SUCCESS";
	   }
	
	@RequestMapping("/list.do")
	   public String selectlist(HttpServletRequest request) {
	      service.selectlist(request);
	      return "list";
	   }
	
	 @RequestMapping("/detail")
	   public ModelAndView detail(ModelAndView mView, @RequestParam int num,HttpServletRequest request) {
	      
		  request.getSession().setAttribute("id", "bob");
		   
		  service.selectdetail(mView,num);
		  service.selectcartoonpointlist(request);
		  
		  mView.addObject("num", num);
	      mView.setViewName("detail");
	      return mView;
	      
	   }
	 
	 @RequestMapping("/administer_sorting_genre_page")
	 public ModelAndView administer_sorting_genre_page(HttpServletRequest request,ModelAndView mView) {
		service.selectlist(request); 
		 mView.setViewName("administer_sorting_genre_page");
		 return mView;
		 
		 
	 }
	 @RequestMapping("/savepoint.do")
	 @ResponseBody
	 public String savepoint(@RequestParam int point,@RequestParam int cartoon_num,
			 @RequestParam String userid, @RequestParam String comment) {
		 CartoonCommentDto dto=new CartoonCommentDto();
		 dto.setPoint(point);
		 dto.setCartoon_num(cartoon_num);
		 dto.setUserid(userid);
		 dto.setComment(comment);
		 service.insertcartoonpoint(dto);
		 System.out.println("호출되냐고");
		 return "success";
		
	 }

	
	
}
