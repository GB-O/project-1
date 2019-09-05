<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label {
		width:300px;
		background-color: lightgreen;
		display:inline-black;
	}
	input{
	}
</style>
</head>
<body>
<div style="text-align: center">
<h1>주문 상세내역</h1>
</div>
<div style="text-align: center">
<c:forEach items="${orderlist }" var="order">
  <li> ${order}</li>
</c:forEach>
</div>
</body>
</html>