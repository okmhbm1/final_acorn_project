<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


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
	      <a  href="#" class="navbar-brand">업데이트</a>
	      <a href="#" class="navbar-brand">웹툰</a>
	      <a  href="#" class="navbar-brand">게시판</a>
	      <a  href="#" class="navbar-brand">리뷰</a>
	   </div>
   </div> <!--네비바 -->

   
   <!-- 바디 -->
   <div class="container">
   <div class="body">
   <div class="container left">
      <h3>만화 이름</h3>
      <hr></hr>
      <div class="row ">
         <div class="col-xs-6"><img class="image-full" src="images/pig.png"/></div>
         <div class="col-xs-6"><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
         tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
         quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
         consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
         cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
         proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p></div> <!--첫번째 row-->
         <button class="btn btn-primary right"> 즐겨찾기</button>          
         <button class="btn btn-primary right" style="margin-right:4px">링크</button>

         
      </div>
      <br/>
         <hr style="border:1.19px solid black">
    <div class="row" style="text-align: center">
         <div class="col-xs-5">☆☆☆☆☆☆☆☆☆☆</div>

         <div class="col-xs-7"><input class="form-control" placeholder="평가를 써주세요."/></div>
         <br/>
         <hr>
         
      
          <div class="col-xs-5">
           <button>추천순</button>
           <button>비추천순</button>
            <button>최신순</button>
          </div>

          <div class="col-xs-5">
          </div>
    </div><!--row 끝-->
            
         <hr style="border:1.19px solid black">




      <div class="row" style="text-align: center">
         <div class="col-xs-5">☆☆☆☆☆☆☆☆☆☆</div>

         <div class="col-xs-7">그저 그럼 6ㄴ점</div>

      </div><!--row2 끝-->

      <br/>
      <hr>
      <div class="row" style="text-align: center">
         <div class="col-xs-5">☆☆☆☆☆☆☆☆☆☆</div>

         <div class="col-xs-7">재미있었네요 10점</div>

      </div><!--row3 끝-->

      <br/>
      <hr>
      <div class="row" style="text-align: center">
         <div class="col-xs-5">☆☆☆☆☆☆☆☆☆☆</div>

         <div class="col-xs-7">별로, 0점</div>

      </div><!--row4 끝-->


    <br/>
    <hr/>


   </div> <!-- container left-->



   <!-- 로그인 -->
   <div class="section right">
      



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
   


  

  </div><!--body 끝-->
	</div> <!--container-->


      
 

   
   
   
<!-- jquery 로딩하기-->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- bootstrap 로딩하기, jquery plugin, jquery 먼저 로딩해야 함-->
<script src="js/bootstrap.min.js"></script>
</body>
</html>