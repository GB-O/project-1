<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<style>
	label{
		width:200px;
		background-color:orange;
		display:inline-block;
	}
	input{
	}
</style>
</head>
<body>
<div style="text-align: center">
<h1>회원정보 수정</h1>
</div>
<form action="cdetail" method="post">
<div style="text-align: center">
 <input type="hidden" name="cId" value="${member.cId}"><br>
<label>비밀번호:</label> <input type="password" name="cPassword" value="${member.cPassword}"><br>
<label>이름:</label> <input type="text" name="cname" value="${member.cname}"><br>
<label>전화번호:</label> <input type="text" name="phoneNumber" value="${member.phoneNumber}"><br>
<label>주소:</label> <input type="text" name="address" value="${member.address}"><br>
<br>
<input type="submit" value="수정하기">
</div>
</form>
</body>
</html>