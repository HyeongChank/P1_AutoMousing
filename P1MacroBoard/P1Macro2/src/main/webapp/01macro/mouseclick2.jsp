<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	h1{
		text-align : center;
	}
	table, tr, td{
		border : 1px solid black;
		border-collapse : collapse;
		padding : 10px;
		margin : 1px;
		text-align : center;
		background-color : #8fa4fe;
		color : white;
		height : 20px;
	}
	table{
		margin-left:auto;
		margin-right:auto;
	}
	#d2{
		text-align : right;
		margin-right : 100px;
	}
	#d1{
		text-align : left;
		margin-left : 100px;
		margin-bottom : 5px;
	}
	
	
</style>
<title>Insert title here</title>

</head>
<body bgcolor = "#bdc9ff">
	<h1>화면 클릭 자동 프로그램</h1>
		<div id = "d2">version : 1.0</div>	
		<form name = "board" method = "get" action = "../02MVCBoard/Default.jsp">
			<div id = "d1"><button type = "submit" style = "align : center; width : 200px;">요구사항 작성 게시판</button></div>
		</form>			
		<form name = "board" method = "get" action = "../03info/Info.jsp">			
			<div id = "d1"><button type = "submit" style = "align : center; width : 200px;" >공지사항(사용방법)</button></div>
		</form>

	<table style = "width:80%;">
	<form name = "mouseclick" method = "get" action = "../test/mouselocation.do" enctype = "multipart/form-data">

			<tr>
				<td style="width: 50%;">${x }, ${y }</td>
				<td colspan = "2" align = "center" style="width: 25%;">
   	  		    	<button type="button" onclick="delayedSubmit()">버튼</button>
   			    </td>
			</tr>

	</form>

	<form name = "mouseclick2" method = "get" action = "../test/mouselocation2.do" enctype = "multipart/form-data">

			<tr>
				<td style="width: 50%;">두번째 좌표</td>
				<td colspan = "2" align = "center" style="width: 25%;">
   		  		    <button type="button" onclick="delayedSubmit2()">버튼</button>
   			    </td>
   			    <td style width="25%;">
	   		    	<div id="timer2">0초</div>
    		    </td>
			</tr>

	</form>

	<form name = "mouseclick3" method = "get" action = "../test/mouselocation3.do" enctype = "multipart/form-data">

			<tr>
				<td style="width: 50%;">세번째 좌표</td>
				<td colspan = "2" align = "center" style="width: 25%;">
	   	  		    <button type="button" onclick="delayedSubmit3()">버튼</button>
   			    </td>
			</tr>

	</form>
	</table>
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
		
		
		
		function delayedSubmit() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer, 1000);
		}
		function delayedSubmit2() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation2.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer2, 1000);
		}
		function delayedSubmit3() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation3.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer3, 1000);
		}
		function reset(){
			session.validate();
			alert("초기화되었습니다");
		}
	</script>

</body>
</html>