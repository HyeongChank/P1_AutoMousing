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
	table, tr, td{
		border : 1px solid blue;
		border-collapse : collapse;
		padding : 10px;
		margin : 1px;
		text-align : center;
		font-size : 15px;
		color : white;
		height : 30px;
	}
	table{
		margin-left:auto;
		margin-right:auto;
	}
	#d2, #d3{
		text-align : right;
		margin-right : 100px;
	}
	#d2{
		color:white;
	}
	#d1{
		text-align : left;
		margin-left : 100px;
		margin-bottom : 10px;
	}
	h1{
		color: white;
	}
	button{
		background-color: transparent; /* 버튼의 배경색을 투명하게 처리 */
		border: 1px solid blue;
		font-size : 14px;
		cursor : pointer;
		color : white;
	}
	button:hover{

		border-color : transparent;
		border: 1px dashed black;
		color : black;
	}
	td:hover{
		background-color : rgba(153, 205, 50, 0.74);
		color : black;
	}
	
</style>
<title>Insert title here</title>
</head>

<body>
	<h1>화면 클릭 자동 프로그램</h1>
		<div id = "d2">version : 1.0</div>	
		<!--  <form name = "board" method = "get" action = "../02MVCBoard/Default.jsp">
			<div id = "d1"><button type = "submit" style = "align : center; width : 200px;">요구사항 작성 게시판</button></div>
		</form>-->		
		<form name = "board" method = "get" action = "../03info/03Info.jsp">			
			<div id = "d1"><button type = "submit" style = "align : center; width : 200px;" >공지사항(사용방법)</button></div>
		</form>
 		<form name = "AllNull" method = "get" action = "../test/AllNull.do" enctype = "multipart/form-data">
			<div id = "d3"><button type="submit">초기화</button></div>
	</form>
	<table style = "width:80%;">
		<form name="mouseclick" method="get" action="../test/xylocation.do" enctype="multipart/form-data">
			<tr>
  				<td style="width: 50%;">첫번째 좌표</td>
  				<td  id="td1" colspan="2" style width="25%;">
    					<button type="button" onclick="delayedSubmit()">클릭</button>
  				</td>
  				<td style="width: 25%;">
    					<div id="timer">0초</div>
  				</td>
			</tr>
		</form>

		<form name = "mouseclick2" method = "get" action = "../test/qwlocation.do" enctype = "multipart/form-data">
			<tr>
 				<td style="width: 50%;">두번째 좌표</td>
 				<td  id="td1" colspan="2" style width="25%;">
   					<button type="button" onclick="delayedSubmit2()">클릭</button>
 				</td>
 				<td style="width: 25%;">
   					<div id="timer2">0초</div>
 				</td>
			</tr>
		</form>

		<form name = "mouseclick3" method = "get" action = "../test/erlocation.do" enctype = "multipart/form-data">
   			<tr>
     			<td style="width: 50%;">세번째 좌표</td>
     			<td colspan="2" style width="25%;">
       				<button type="button" onclick="delayedSubmit3()">클릭</button>
     			</td>
     			<td style="width: 25%;">
       				<div id="timer3">0초</div>
     			</td>
   			</tr>
		</form>
		
		<form name = "mouseclick4" method = "get" action = "../test/tulocation.do" enctype = "multipart/form-data">
   			<tr>
     			<td style="width: 50%;">네번째 좌표</td>
     			<td colspan="2" style width="25%;">
       				<button type="button" onclick="delayedSubmit4()">클릭</button>
     			</td>
     			<td style="width: 25%;">
       				<div id="timer4">0초</div>
     			</td>
   			</tr>
		</form>	
		
		<form name = "mouseclick5" method = "get" action = "../test/omlocation.do" enctype = "multipart/form-data">
   			<tr>
     			<td style="width: 50%;">다섯번째 좌표</td>
     			<td colspan="2" style width="25%;">
       				<button type="button" onclick="delayedSubmit5()">클릭</button>
     			</td>
     			<td style="width: 25%;">
       				<div id="timer5">0초</div>
     			</td>
   			</tr>
		</form>		
		
		<form name = "mouseclick6" method = "get" action = "../test/a1a2location.do" enctype = "multipart/form-data">
   			<tr>
     			<td style="width: 50%;">여섯번째 좌표</td>
     			<td colspan="2" style width="25%;">
       				<button type="button" onclick="delayedSubmit6()">클릭</button>
     			</td>
     			<td style="width: 25%;">
       				<div id="timer6">0초</div>
     			</td>
   			</tr>
		</form>
		
	</table>
	
	
	
	<form name = "macrostart" method = "get" action = "../test/start.do" enctype = "multipart/form-data">
		<table style = "width:80%;">   
			<tr>
				<td style="width: 50%;">1번-2번 간격(초) : <input type = "number" name = "delayxy"/></td>
				<td style="width: 50%;">2번-3번 간격(초) : <input type = "number" name = "delayqw"/></td>
			</tr>		
			<tr>
				<td style="width: 50%;">3번-4번 간격(초) : <input type = "number" name = "delayer"/></td>
				<td style="width: 50%;">1회 순회 후 대기시간(초) : <input type = "number" name = "delay1"/></td>
			</tr>		
			<tr>
				<td style="width: 50%;">반복횟수 : <input type = "number" name = "roop"/></td>
				<td><button type = "submit">시작하기</button></td>
			</tr>		
		</table>
	</form>
		 

      
      
      	


	<script>
 		let time =0;
		const timerElement = document.getElementById("timer");
		function updateTimer() {
		    time += 1;
		    timerElement.innerText = time + "초";
		}
		
 		let time2 =0;
		const timerElement2 = document.getElementById("timer2");
		function updateTimer2() {
		    time2 += 1;
		    timerElement2.innerText = time2 + "초";
		}
		
 		let time3 =0;
		const timerElement3 = document.getElementById("timer3");
		function updateTimer3() {
		    time3 += 1;
		    timerElement3.innerText = time3 + "초";
		}
		
 		let time4 =0;
		const timerElement4 = document.getElementById("timer4");
		function updateTimer4() {
		    time4 += 1;
		    timerElement4.innerText = time4 + "초";
		}
		
 		let time5 =0;
		const timerElement5 = document.getElementById("timer5");
		function updateTimer5() {
		    time5 += 1;
		    timerElement5.innerText = time5 + "초";
		}
 		let time6 =0;
		const timerElement6 = document.getElementById("timer6");
		function updateTimer6() {
		    time6 += 1;
		    timerElement6.innerText = time6 + "초";
		}
		
		
		
		function delayedSubmit() {
			setTimeout(function() {
				document.mouseclick.action = "../test/xylocation.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer, 1000);
		}
		function delayedSubmit2() {
			setTimeout(function() {
				document.mouseclick.action = "../test/qwlocation.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer2, 1000);
		}
		function delayedSubmit3() {
			setTimeout(function() {
				document.mouseclick.action = "../test/erlocation.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer3, 1000);
		}
		function delayedSubmit4() {
			setTimeout(function() {
				document.mouseclick.action = "../test/tulocation.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer4, 1000);
		}
		function delayedSubmit5() {
			setTimeout(function() {
				document.mouseclick.action = "../test/omlocation.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer5, 1000);
		}
		function delayedSubmit6() {
			setTimeout(function() {
				document.mouseclick.action = "../test/a1a2location.do";
				document.mouseclick.submit();
			}, 3000);
			setInterval(updateTimer6, 1000);
		}
		
		function reset(){
			session.validate();
			alert("초기화되었습니다");
		}
	</script>

</body>
</html>