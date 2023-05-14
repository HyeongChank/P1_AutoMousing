<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	body {
		background-image: url('https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdrKg9a%2FbtqU4BM494i%2Fk2q9zsTk1oUZNxHq2s4oik%2Fimg.jpg');
		background-size: cover;
		background-position: center;
		height: 100vh;
		margin: 0;
		padding: 0;
	}

	#total{
		display : flex;
		justify-content : center;
		align-items : center;
	}
	#div1{
		font-size: 30px;
		font-weight : bold;
		color : white;
		width : 70%;
		height : 100px;
		display : flex;
		justify-content : center;
		align-items : center;


	}
	#div2{
		background-color : white;
		border : solid 1px black;
		width : 70%;
		height : 700px;

		
		}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id = "total"></div>
	<div id ="div1">공지사항</div>
	<form name = "board" method = "get" action = "../01macro/Mouseclick1.jsp">			
		<div id = "d1"><button type = "submit" style = "align : center; width : 200px;" >Main페이지 이동</button></div>
	</form>
	<div id= "div2">
		
		<h4> 1. 개요 : 화면 좌표(위치)를 일정 시간을 두고 반복하여 클릭하는 프로그램 </h4>
		<h4> 2. 사용방법</h4>
		<h5> &nbsp;&nbsp;   - 좌표 저장 : 위치 저장 버튼을 누르고 저장하고자 하는 위치로 마우스를 이동하세요.</h3>
		<h5> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            3초 후 마우스가 위치한 곳의 좌표를 저장합니다.(최대 5개)</h3>
		<h5> &nbsp;&nbsp;   - n번-m번 간격(초) : 해당 마우스 클릭 간 간격(초)</h3>
		<h5> &nbsp;&nbsp;   - 1회 순회 후 대기시간 : 최대 5개의 마우스 클릭 후 다음 첫 클릭까지의 대기 시간</h3>
		<h5> &nbsp;&nbsp;   - 반복 시작하기 : 마우스 좌표 저장 및 대기 시간, 반복 횟수 입력 후 시작하기 버튼 클릭</h3>
		<h5> &nbsp;&nbsp;   - 반복 멈추기 : 반복 시작 시 작은 창(JFrame)이 뜹니다. 이 창을 클릭한 뒤 스페이스바를 누르면 반복 중지됨</h3>
		<h5> &nbsp;&nbsp;   - 음악 끄기 : 반복 시작 시 작은 창(JFrame)이 뜹니다. 이 창의 stop 버튼 클릭하면 음악 꺼짐</h3>
		<h5> &nbsp;&nbsp;   - 초기화 : 현재 저장된 마우스 위치가 모두 초기화 됨</h3>
	
	
	
	</div>
	

</body>
</html>