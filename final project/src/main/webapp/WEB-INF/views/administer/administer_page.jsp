<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
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
    a{
    color:black;
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
        <a href="#" class="navbar-brand">웹툰</a>
        <a  href="#" class="navbar-brand">게시판</a>
        <a  href="#" class="navbar-brand">리뷰</a>
     </div>
   </div> <!--네비바 -->

   
   <!-- 바디 -->
   <div class="container" style="height:200%">
   <div class="body">

    

    <div class="left col-xs-push-2" style="width:60%;height:150%;position:relative;top:20%;text-align:center"><br><br>
                  <div class="container" style="width:100%">
                          <div class="row" style="background-color:gray">

                                    <div>관리자 페이지 입니다.</div>
                                    <br>

                                    <div class="col-xs-4">
                                    <img src="${pageContext.request.contextPath}/resources/images/topni.jpg" style="position:relative;width:100%;height:150px">
                                            <div><a href="crawling.do">네이버 크롤링</a></div>
                                    </div>
                                    <div class="col-xs-4">
                                    <img src="${pageContext.request.contextPath}/resources/images/topni2.jpg" style="position:relative;width:100%;height:150px">    
                                            <div><a href="crawling2.do">레진 크롤링</a></div>
                                    </div>
                                    <div class="col-xs-4">
                                      <img src="${pageContext.request.contextPath}/resources/images/shintop.jpg" style="position:relative;width:100%;height:150px">
                                            <div><a href="administer_sorting_genre_page.do">다운받은 만화 장르 설정</a></div>
                                    </div>
                                    <div class="col-xs-4">
                                    <img src="${pageContext.request.contextPath}/resources/images/search.jpg" style="position:relative;width:100%;left:118%;height:150px">
                                    <div style="position:relative;left:118%;"><a href="checkcategory.do">네이버 카테고리 클로링</a></div>
                                    </div>        
                                    <div class="col-xs-4">
                                      <img src="${pageContext.request.contextPath}/resources/images/member.jpg" style="position:relative;width:100%;left:118%;height:150px">
                                    <div style="position:relative;left:118%;">회원정보 관리</div>
                                    </div>        
                                    
                            </div>
                            
                   </div>
              </div>
    </div>
    
   

 
   
</div> <!-- body -->
</div> <!--container-->
      
 

  

<!-- jquery 로딩하기-->
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<!-- bootstrap 로딩하기, jquery plugin, jquery 먼저 로딩해야 함-->
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>