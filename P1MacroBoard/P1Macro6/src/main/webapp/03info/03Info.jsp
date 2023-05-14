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


	#div1{
		font-size: 30px;
		font-weight : bold;
		color : white;
		width : 100%;
		height : 100px;
		display : flex;
		justify-content : center;
		align-items : center;


	}
	#container{
		display : flex;
		flex-direction : column;
		justify-content : center;
		align-items : center;
	}
	#div2{
	
		background-color: rgba(128, 128, 128, 0.5);
		border : solid 1px black;
		width : 90%;
		color : white;
		height : 700px;
		}
	button{
		background-color: rgba(128, 128, 128, 0.5);
		border: 1px solid blue;
		font-size : 14px;
		cursor : pointer;		
		width : 100px;
		color : white;
		margin : 10px;
	}		
</style>
<title>Insert title here</title>
</head>
<body>
	
		<div id ="div1">공지사항</div>
		<div id = "container">
			<div id = "d1">
				<form name = "board" method = "get" action = "../01macro/ClickFunc.jsp">			
				<button type = "submit" style = "align : center; width : 200px;" >Click Macro Page 이동</button>
				</form>
			</div>

			<div id= "div2">
				
				<h4> 1. 개요 : 모니터 화면 좌표(위치)를 저장하고 반복하여 클릭하는 프로그램 </h4>
				<h4> 2. 사용방법</h4>
				<h5> &nbsp;&nbsp;   - Save Location(좌표 저장) : 클릭 버튼을 누르고 저장하고자 하는 위치로 마우스를 이동하세요.</h3>
				<h5> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            3초 후 마우스가 위치한 곳의 좌표를 저장합니다.(최대 6개)</h3>
				<h5> &nbsp;&nbsp;   - n-m Click Interval(s) : 해당 마우스 클릭 간 간격(초)</h3>
				<h5> &nbsp;&nbsp;   - Start(반복 시작하기) : 마우스 좌표 저장 및 대기 시간, 반복 횟수 입력 후 시작하기 버튼 클릭</h3>
				<h5> &nbsp;&nbsp;   - Stop(반복 멈추기) : 반복 시작 시 작은 창(JFrame)이 뜹니다. 이 창을 클릭한 뒤 스페이스바를 누르면 반복 중지됨</h3>
				<h5> &nbsp;&nbsp;   - Stop Music(음악 끄기) : 반복 시작 시 작은 창(JFrame)이 뜹니다. 이 창의 stop 버튼 클릭하면 음악 꺼짐</h3>
				<h5> &nbsp;&nbsp;   - Reset(초기화) : 현재 저장된 마우스 위치가 모두 초기화 됨</h3>
			
			
			
			</div>
		</div>

</body>
</html>