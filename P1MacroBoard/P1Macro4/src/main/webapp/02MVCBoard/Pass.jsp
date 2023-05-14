<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<script type = "text/javascript">
	function validateForm(form){
		if(form.pass.value == ""){
			alert("비밀번호 입력");
			form.pass.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form name = "writeFrm" method = "post" action = "../mvcboard/pass.do" onsubmit = "return validateForm(this);">
	<input type = "hidden" name = "idx" value = "${param.idx }"/>
	<input type = "hidden" name = "mode" value = "${param.mode }"/>
	<table border = "1" width = "90%">
		<tr>
			<td>비밀번호</td>
			<td>
				<input type = "password" name = "pass" style = "width:100px;"/>
			</td>
		</tr>
		<tr>
			<td colspan = "2" align = "center">
				<button type = "submit">검증하기</button>
				<button type = "reset">reset</button>
				<button type = "button" onclick = "location.href='../mvcboard/list.do';">
				목록 바로가기
				</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>