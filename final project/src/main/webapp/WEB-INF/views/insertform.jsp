<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <form action="insert.do" method="post">
      <label for="title">제목</label>
      <input type="text" name="title" id="title"/>
      <br/>
      <label for="days">작가</label>
      <input type="text" name="days" id="days"/>
      <br/>
      <label for="description">줄거리</label>
      <textarea name="description" id="description" style="width:100%;height:400px;display:none;"></textarea>
      <br/>
      <label>
          <input type="checkbox" id="portal" name="portal" value="naver">
           네이버
      </label>
      <label>
          <input type="checkbox" id="portal" name="portal" value="daum">
           다음
      </label>
      <label>
          <input type="checkbox" id="portal" name="portal" value="legin">
         레진코믹스
      </label>
      
      <br/>
      <label>
          <input type="checkbox" id="days" name="days" value="day1">
           월요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day2">
           화요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day3">
          수요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day4">
           목요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day5">
           금요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day6">
         토요일
      </label>
      <label>
          <input type="checkbox" id="days" name="days" value="day7">
         일요일
      </label>
      <br/>
      <label>
          <input type="checkbox" id="category" name="category" value="d">
          드라마
      </label>
      <label>
          <input type="checkbox" id="category" name="category" value="p">
           판타지
      </label>
      <label>
          <input type="checkbox" id="category" name="category" value="a">
          액션
      </label>
      <label>
          <input type="checkbox" id="category" name="category" value="r">
           로맨스
      </label>
      <label>
          <input type="checkbox" id="category" name="category" value="s">
           스포츠
      </label>
      <label>
          <input type="checkbox" id="category" name="category" value="m">
          무협
      </label>
   </form>
</body>
</html>