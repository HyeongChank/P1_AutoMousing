<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	button{
		background-color: transparent; /* 버튼의 배경색을 투명하게 처리 */
		border: 1px solid blue;
		font-size : 14px;
		cursor : pointer;		
		width : 100px;
	}
</style>
</head>
<body>
	<div id = "d1">
		<form name = "board" method = "get" action = "../01macro/Mouseclick2.jsp">			
		<button type = "submit" style = "align : center; width : 200px;" >Main페이지 이동</button>
		</form>
	</div>
	<h2>블로그에 요청 및 에러를 적어주시면 반영(수정) 하겠습니다.</h2>
	<h2>https://khc-developer.tistory.com/24</h2>
	<a href="https://khc-developer.tistory.com/24">바로가기</a>
	<h2>CTRL키 + 바로가기 키 클릭</h2>
</body>
</html>