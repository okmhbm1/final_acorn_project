package com.bob.please.cartoon.dto;



public class CartoonDto {
	   int num;
	      String days;
	      String title;
	      String description; 
	      String painter;
	      String category;
	      
	      int point; 
	      int likes;
	      int hit;
	      String detail_uri;
	      String image_url;
	      String portal; 
	      String regdate;
	      
	      public CartoonDto(){
	         
	      }

	   public int getHit() {
			return hit;
		}

		public void setHit(int hit) {
			this.hit = hit;
		}

	public CartoonDto(int num, String days, String title, String description, String painter, String category,
	         int point, int likes, int hit, String detail_uri, String image_url, String portal, String regdate) {
	      super();
	      this.num = num;
	      this.days = days;
	      this.title = title;
	      this.description = description;
	      this.painter = painter;
	      this.category = category;
	      this.point = point;
	      this.likes = likes;
	      this.detail_uri = detail_uri;
	      this.image_url = image_url;
	      this.portal = portal;
	      this.regdate = regdate;
	      this.hit=hit;
	   }

	   public int getNum() {
	      return num;
	   }

	   public void setNum(int num) {
	      this.num = num;
	   }

	   public String getDays() {
	      return days;
	   }

	   public void setDays(String days) {
	      this.days = days;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public String getDescription() {
	      return description;
	   }

	   public void setDescription(String description) {
	      this.description = description;
	   }

	   public String getPainter() {
	      return painter;
	   }

	   public void setPainter(String painter) {
	      this.painter = painter;
	   }

	   public String getCategory() {
	      return category;
	   }

	   public void setCategory(String category) {
	      this.category = category;
	   }

	   public int getPoint() {
	      return point;
	   }

	   public void setPoint(int point) {
	      this.point = point;
	   }

	   public int getLikes() {
	      return likes;
	   }

	   public void setLikes(int likes) {
	      this.likes = likes;
	   }

	   public String getDetail_uri() {
	      return detail_uri;
	   }

	   public void setDetail_uri(String detail_uri) {
	      this.detail_uri = detail_uri;
	   }

	   public String getImage_url() {
	      return image_url;
	   }

	   public void setImage_url(String image_url) {
	      this.image_url = image_url;
	   }

	   public String getPortal() {
	      return portal;
	   }

	   public void setPortal(String portal) {
	      this.portal = portal;
	   }

	   public String getRegdate() {
	      return regdate;
	   }

	   public void setRegdate(String regdate) {
	      this.regdate = regdate;
	   }
	   

}
