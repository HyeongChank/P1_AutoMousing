<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<%@ page import="java.util.LinkedList" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	body {
		background-image: url('https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FusPRs%2FbtqVbvLCRNA%2F1ayiM4Th8e3fot0bqVRHu0%2Fimg.jpg');
		background-size: cover;
		background-position: center;
		height: 100vh;
		margin: 0;
		padding: 0;
	}
	h1{
		text-align : center;
	}	
	#bclick:hover{
		background-color : white;
		color : black;
		font-weight : bold;
	}
	
	h1{
		color: white;
	}
	button{
		background-color: black;
		font-size : 14px;
		cursor : pointer;
		color : white;
		padding : 10px;
		margin : 5px;
	}
	div{
		display : flex;
		align-items : center;
		justify-content : center;
		flex-direction : column;
	}
	tb{
		bord : solid 1px black;
		width : 60%;
		height : 60%;
	}

</style>
<title>Insert title here</title>
</head>

<body>
	<h1>Main Page</h1>
	<div>
	<table id="tb">
		<form name = "board" method = "get" action = "ClickFunc.jsp">
			<button id="bclick" type = "submit" style = "align : center; width : 200px;">Click Macro page</button>
		</form>
		<form name = "board" method = "get" action = "ClickFunc.jsp">
			<button id="bclick" type = "submit" style = "align : center; width : 200px;">Crawling page</button>
		</form>					
	</table>
	</div>
</body>
</html>