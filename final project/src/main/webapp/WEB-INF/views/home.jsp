<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <title>insert title here</title>
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">

</head>
<style type="text/css">

   #header{
      position:relative;
      top:0px;
      width:100%;
      height:150px;

   }

   #image,#advertisement{
      position:absolute;
      display:inline-block;
      top:0px;
      width:100%;
      height:100%;

   }
   #image{
      position:relative;
      height:150px;
      width:340px;
      display:inline-block;
   }
   #searchbar{
      top:70px;
      width:270px;

   }
   #advertisement{
      height:150px;
      width:380px;
      display:inline-block;
   }

   .nav-container{
      display:block;
      top:120px;
      width:100%;
      height:50px;
      border:1px solid white;

      padding:0px;

   }


   .body{
      padding:0;
      margin:0;
      width:100%;
      border:10px solid #ffffff;
      height:400px;

   }

   .row{
      width:100%;
   }
   .section{
      position:relative;
      top:30px;
      float:right;
      width:20%;
      height:100%;
      border: 1px solid white;

   }
   .col-xs-2{

      display:block;
      width:142px;
   }
   .left{
      float:left;
      width:80%;
      height:100%;
      border:1px solid white;
   }
   .image{
      width:100%;
      height:100%;
   }
   .advertisement{
      display:inline-block;
      width:100%;
      height:100%;
   }

   .box{
      width:50%;
      height:30%;
   }
   .no-border{
            border-right:none

        border-left:none

        border-top:none

        border-bottom:none
        border: none;
   }
   .left{
    float:left;
   }
   .right{
    float:right;
   }

   .navbar{
    padding-left:190px;
   }

/* borderless table */
.table.table-borderless td, .table.table-borderless th {
    border: 0 !important;
}

.table.table-borderless {
    margin-bottom: 0px;
}

.col-xs-12{
  position:relative;
}
.image-full{

  width:100%;
  height:200px;
}

.display-none{

}

    @media (max-width: 750px){
       .display-none{
        display:none;
        
      }
     
    }
</style>
<body>
   

   <div class="container">
      <div id="header">
      <!-- 메인배너 -->
      <div class="row">
      	<div class="col-xs-4" id="image"> <img class="image" src="${pageContext.request.contextPath}/resources/images/banner.jpg"/></div>
		

	  <!--헤더 서치바-->   
      <div class="col-xs-3 col-xs-offset-1 display-none">         
      	<div class="input-group" id="searchbar">
	      <input type="text" class="form-control" placeholder="Search for...">
	      <span class="input-group-btn">
	        <button class="btn btn-default glyphicon glyphicon-search" type="button"></button>
	      </span>
      	</div><!-- /input-group -->
     </div>


     <!-- 광고 -->
   	  <div class="col-xs-3" id="advertisement"><img class="advertisement display-none" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"/></div>
   	</div>
   	</div>
   </div>




   <div class="nav-container">
	   <div class="navbar navbar-inverse">
	      <a  href="#" class="navbar-brand">업데이트 </a>
	      <a href="cartoon/list.do" class="navbar-brand">웹툰</a>
	      <a  href="#" class="navbar-brand">게시판</a>
	      <a  href="#" class="navbar-brand">리뷰</a>
	   </div>
   </div> <!--네비바 -->

   
   <!-- 바디 -->
   <div class="container">
   <div class="body">
   <div class="container left">
      <h3>종합 인기순</h3>
      <hr></hr>
      <div class="row ">
         <div class="col-xs-2">1</div>
         <div class="col-xs-2">2</div>
         <div class="col-xs-2">3</div>
         <div class="col-xs-2">4</div>
         <div class="col-xs-2">5</div>
         <div class="col-xs-2">6</div>
      </div>
      <div class="row ">
         <div class="col-xs-2">1</div>
         <div class="col-xs-2">2</div>
         <div class="col-xs-2">3</div>
         <div class="col-xs-2">4</div>
         <div class="col-xs-2">5</div>
         <div class="col-xs-2">6</div>
      </div>
   </div> <!-- container left-->


   <!-- 로그인 -->
   <div class="section right">
    <c:choose>
   <c:when test="${empty sessionScope.userid }">
           <form class="form-signin" action="member/login.do?url=${param.url }" method="post">
      <label for="userid" class="sr-only">Your ID</label>
        <input type="text" id="userid" name="userid" class="form-control" placeholder="아이디" required autofocus><BR>
        <label for="pwd" class="sr-only">Password</label>
        <input type="password" id="pwd" name="pwd" class="form-control" placeholder="비밀번호" required><br>
        <button id="btn-Yes" class="btn btn-sm btn-default btn-block" type="submit">로 그 인</button>
        <div class="checkbox">
          <label>
            <input type="checkbox"> 기억하기 
          </label>
          <a href="member/signup_form.do">회원가입</a>
        </div>
      </form>
   </c:when>
   <c:otherwise>
      <div><h4><a href="member/info.do">${userid }</a>님</h4><a href="member/info.do">내정보</a></div>
      <a href="cartoon/link_detail.do">즐겨찾기 목록</a><br>
         <a href="member/logout.do">로그아웃</a>
         
   </c:otherwise>
   </c:choose>


     <!--주간/월간 순위-->
    <h3>주간/월간 순위</h3>
  <table class="table table-striped table-condensed">
    <tbody>
      <tr>
        <td>1등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>2등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>3등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>4등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>5등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>6등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>7등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>8등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>9등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>10등</td><td>드래곤볼</td>
      </tr>
    </tbody>
  </table>
   	</div> <!-- section--> 
   


   	<!--게시판 모음-->
      <div class="body">
   <div class="container left">
      <h3>게시판</h3>
      <hr></hr>
      <div class="row ">

         <div class="col-xs-6"><h4>자유게시판</h4>
          <hr>
     <table class="table table-borderless">
    <tbody>
      <tr>
        <td>1등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>2등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>3등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>4등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>5등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>6등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>7등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>8등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>9등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>10등</td><td>드래곤볼</td>
      </tr>
  </table>       

	</div><!--자유게시판 끝-->


     <div class="col-xs-6"><h4>익명게시판</h4>
          <hr>
  <table class="table table-borderless">
    <tbody>
      <tr>
        <td>1등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>2등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>3등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>4등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>5등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>6등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>7등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>8등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>9등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>10등</td><td>드래곤볼</td>
      </tr>
      </tbody>
  </table>
       </div> <!--익명게시판 끝-->
         
      

      <div class="row ">
         <div class="col-xs-6"><h4>리뷰</h4>
          <hr>
  		<table class="table table-borderless ">

    <tbody>
      <tr>
        <td>1등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>2등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>3등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>4등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>5등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>6등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>7등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>8등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>9등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>10등</td><td>드래곤볼</td>
      </tr>
      
    </tbody>
  </table>
   </div>
  <!--리뷰 게시판 끝-->

  
  <div class="col-xs-6">
  	<h4>질문게시판</h4>
          <hr>
  <table class="table table-borderless">

    <tbody>
      <tr>
        <td>1등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>2등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>3등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>4등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>5등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>6등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>7등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>8등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>9등</td><td>드래곤볼</td>
      </tr>
            <tr>
        <td>10등</td><td>드래곤볼</td>
      </tr>
      
    </tbody>
  </table>	
	</div> <!--질문 게시판 끝-->

  </div><!--body 끝-->
	</div> <!--container-->
      
 

  
<a href="cartoon/detail.do">detail</a>
<a href="checkcategory.do">checkcategory</a>
<a href="administer/administer_page.do">administer_page</a>
<!-- jquery 로딩하기-->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- bootstrap 로딩하기, jquery plugin, jquery 먼저 로딩해야 함-->
<script src="js/bootstrap.min.js"></script>
</body>
</html>