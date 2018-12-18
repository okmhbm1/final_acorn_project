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
import com.bob.please.cartoon.dto.CartoonLikeDto;
import com.bob.please.cartoon.dto.onelike_or_dislikeDto;
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

	
	@RequestMapping("/cartoon/list.do")
	   public String selectlist(HttpServletRequest request) {
	      service.selectlist(request);
	      return "cartoon/list";
	   }
	
	 @RequestMapping("/cartoon/detail.do")
	   public ModelAndView detail(ModelAndView mView, @RequestParam int num,HttpServletRequest request) {
	      
		  request.getSession().setAttribute("id", "asdfasdffads11");
		   
		  service.selectdetail(mView,num);
		  service.selectcartoonpointlist(request);
		  
		  mView.addObject("num", num);
	      mView.setViewName("cartoon/detail");
	      return mView;
	      
	   }
	 
	
	 @RequestMapping("/administer/administer_sorting_genre_page")
	 public ModelAndView administer_sorting_genre_page(HttpServletRequest request,ModelAndView mView) {
		service.selectlist(request); 
		 mView.setViewName("administer/administer_sorting_genre_page");
		 return mView;
		 
		 
	 }
	 
	
	@RequestMapping("/administer/crawling.do")
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

	
	
	@RequestMapping("/administer/crawling2.do")
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
	    		  dto.setTitle(j.select(".title").text().replaceAll("title:", ""));
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
	
	@RequestMapping("/administer/administer_page.do")
	public ModelAndView administer_page(ModelAndView mView) {
		
		mView.setViewName("administer/administer_page");
		return mView;
	}

	
	@RequestMapping("/administer/checkcategory.do")
	public ModelAndView checkcategory(ModelAndView mView)
	{
		Document doc = null;
		CartoonDto dto=null;
		String category=null;
	
		try {
		doc=Jsoup.connect("https://comic.naver.com/webtoon/genre.nhn").get();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Elements elements = doc.select(".spot").select("li");
		for(Element genre : elements) {
			category = genre.select("a").text();
			//System.out.println("category:"+category);
			String new_url=genre.select("a[href]").attr("abs:href");
			try {
				doc=Jsoup.connect(new_url).get();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			Elements list=doc.select(".img_list").select("li");
			for(Element element: list) {
				String title=element.select("dt").select("a").text();
				dto=new CartoonDto();
				dto.setCategory(category);
				dto.setTitle(title);
				service.updatecategory(dto);
				System.out.println("category : "+category+", title:"+title);
			}
			
			System.out.println("");
			System.out.println("");
		}
		
		mView.setViewName("home");
		return mView;
	}
	
	//관리자 화면에서 만화 분류 ajax 요청 응답
	@RequestMapping("/administer/sort.do")
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
	

	


	 
	 // detail 화면에서 댓글 저장
	 @RequestMapping("/cartoon/savepoint.do")
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
	 
	 // 댓글에 추천했을 때 추천수 증가 ajax 요청 반응
	 @RequestMapping("/cartoon/good.do")
	 @ResponseBody
	 public String good(@RequestParam int cartoon_num, @RequestParam String userid,String uploaderid) {

		 int is_selected= service.is_selected(userid);
		 
		 if(is_selected==1) {
			 System.out.println("이미 평가함");
			 return "fail";
		 }
		 CartoonCommentDto dto=new CartoonCommentDto();
		 dto.setUserid(uploaderid);
		 dto.setCartoon_num(cartoon_num);
		 service.updategood(dto);
		 onelike_or_dislikeDto dto2 = new onelike_or_dislikeDto(cartoon_num,userid,1);
		 service.set_selected(dto2);



		 return "success";
		
	 }
	 //댓글에 비추천했을 때 비추천수 증가 ajax 요청 반응
	 @RequestMapping("/cartoon/notgood.do")
	 @ResponseBody
	 public String notgood(@RequestParam int cartoon_num, @RequestParam String userid,@RequestParam String uploaderid) {
		 int is_selected= service.is_selected(userid);
		 if(is_selected==1) {
			 System.out.println("이미 평가함");
			 return "fail";
		 }
		 CartoonCommentDto dto=new CartoonCommentDto();
		 dto.setUserid(uploaderid);
		 dto.setCartoon_num(cartoon_num);
		 service.updatebad(dto);
		 onelike_or_dislikeDto dto2 = new onelike_or_dislikeDto(cartoon_num,userid,1);
		 service.set_selected(dto2);
		 System.out.println("데이터베이스 업데이트함");
		 
		 
		 return "success";
		
	 }
	
	 //만화 추천수 증가
	 @RequestMapping("/cartoon/recommend.do")
	 @ResponseBody
	 public String recommend(@RequestParam int cartoon_num, @RequestParam String userid) {
		 
		 CartoonLikeDto dto=new CartoonLikeDto();
		 dto.setUserid(userid);
		 dto.setCartoon_num(cartoon_num);
		 int is_selected= service.is_recommend_selected(dto);
		 System.out.println(is_selected);
		 if(is_selected !=0) {
			 System.out.println("이미 평가함");
			 System.out.println("fail");
			 return "fail";
		 }
		 //cartoon의 likes를 증가시키고
		 //insert_recomm는 그냥 등록만 하면 된다.

		 service.update_likes(cartoon_num);
		 System.out.println("likes update완료");
;
		 service.insert_recomm(dto);
		 System.out.println("recomm insert완료");
		 
		 System.out.println("데이터베이스 업데이트함");
		 
		 
		 return "success";
		
	 }
	
}
