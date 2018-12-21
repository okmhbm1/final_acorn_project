<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/board_free/insertform.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<!-- 스마트 에디터 주석 -->
<%-- <script src="${pageContext.request.contextPath }/SmartEditor/js/HuskyEZCreator.js"></script> --%>
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${id ne null }">
			<p><strong>${id }</strong>님 로그인중...</p>
			<h3>자유게시판입니다.</h3>
			<form action="insert.do" method="post">
				<label for="writer">아이디</label>
				<input type="text" name="writer" id="writer" value=${ id}/><br/>
				<label for="title">제목</label>
				<input type="text" name="title" id="title"/><br/>
				<label for="content">내용</label>
				<textarea name="content" id="content" style="width:100%;height:400px;"></textarea>
				<button type="submit">저장하기</button>
			</form>
		</c:when>
		<c:otherwise>
			<p><strong>비회원</strong>으로 글쓰기 중...</p>
			<h3>자유게시판입니다.</h3>
			<form action="insert.do" method="post">	
				<label for="writer">아이디</label>
				<input type="text" name="writer" id="writer"/><br/>
				<label for="title">제목</label>
				<input type="text" name="title" id="title"/><br/>
				<label for="content">내용</label>
				<textarea name="content" id="content" style="width:100%;height:400px;"></textarea>
				<button type="submit">저장하기</button>
			</form>	
			</c:otherwise>		
		</c:choose>		
	</div>
</body>
</html>

<!-- 스마트 게시판 -->
<%-- <body>
<div class="container">
	<p><strong>${id }</strong>님 로그인중...</p>
	<h3>새 글 작성</h3>
	<form action="insert.do" method="post">
		<label for="title">제목</label>
		<input type="text" name="title" id="title"/>
		<br/>
		<label for="content">내용</label>
		<textarea name="content" id="content" style="width:100%;height:400px;display:none;"></textarea>
		<div>
			<input type="button" onclick="pasteHTML();" value="본문에 내용 넣기" />
			<input type="button" onclick="showHTML();" value="본문 내용 가져오기" />
			<input type="button" onclick="submitContents(this);" value="서버로 내용 전송" />
			<input type="button" onclick="setDefaultFont();" value="기본 폰트 지정하기 (궁서_24)" />
		</div>	
	</form>
</div>
<script>
	var oEditors = [];

	//추가 글꼴 목록
	//var aAdditionalFontSet = [["MS UI Gothic", "MS UI Gothic"], ["Comic Sans MS", "Comic Sans MS"],["TEST","TEST"]];

	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "content",
		sSkinURI: "${pageContext.request.contextPath}/SmartEditor/SmartEditor2Skin.html",	
		htParams : {
			bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
			//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
			fOnBeforeUnload : function(){
				//alert("완료!");
			}
		}, //boolean
		fOnAppLoad : function(){
			//예제 코드
			//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
		},
		fCreator: "createSEditor2"
	});

	function pasteHTML() {
		var sHTML = "<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\/span>";
		oEditors.getById["content"].exec("PASTE_HTML", [sHTML]);
	}

	function showHTML() {
		var sHTML = oEditors.getById["content"].getIR();
		alert(sHTML);
	}
		
	function submitContents(elClickedObj) {
		oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []);	// 에디터의 내용이 textarea에 적용됩니다.
		
		// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.
		
		try {
			elClickedObj.form.submit();
		} catch(e) {}
	}

	function setDefaultFont() {
		var sDefaultFont = '궁서';
		var nFontSize = 24;
		oEditors.getById["content"].setDefaultFont(sDefaultFont, nFontSize);
	}
</script>
</body>
</html> --%>