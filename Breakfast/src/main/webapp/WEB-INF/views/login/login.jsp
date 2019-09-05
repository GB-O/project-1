<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>

	<script type="text/javascript">
		function check() {
			if(!document.loginForm.cId.value) {
				alert("아이디를 입력하세요");
				return false;
			} else if(!document.loginForm.cPassword.value) {
				alert("비밀번호를 입력하세요");
				return false;
			}
		}	
		
	</script>
<body>	
	<div style="text-align: center">
		<h1>BreakfastGO</h1>
	</div> 
	<hr>
	<div>
		<form name="loginForm" action="loginInfo" method="post"
			onsubmit = "return check();">
		<table border="1" style="margin: auto; text-align: center">
			<tr>
				<th colspan="4">주문을 위해 로그인!
				</th>
			</tr>
			<tr>	
				<th style="width: 40%">ID:</th>
				<td colspan="3"><input type="text" name="cId" placeholder="Enter your ID"></td>
			</tr>
			<tr>	
				<th style="width: 40%">Password:</th>
				<td colspan="3"><input type="password" name="cPassword" placeholder="Enter your Password"></td>
			</tr>
			<tr>
				<td colspan="2" style="width: 40%"><input type="submit" value="로그인"></td>
				<td colspan="2" style="width: 40%"><input type="button"
				value="화원가입" onclick="location.href='<c:url value='/login/register'/>';"></td>
		</table>
			
		</form>
	</div>
	
</body>
</html>