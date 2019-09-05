<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문하기</title>
<script>

function call(path){
	 
	location.href=path + "/food/detail";
}

</script>
</head>
<body>
	<div style="text-align: right">
	${member.cname} 님 환영합니다. <br>
		 <a href="/myapp/food/orderlist">주문 내역</a><br>		
		 <a href="/myapp/login/cdetail">회원정보 수정</a><br>		
		 <a href="/myapp/login/logout">로그아웃</a>
	</div>
  <div style="text-align: center">
  	<h1>든든한 하루를 위하여!</h1>
  	<h3>기호에 맞게 주문을 해봐요</h3>
  	</div>
  <form action="select" >	
  <div style="text-align: center">
    
    <a  href="${path}/food/detail">바로 주문</a>
    
    <hr>
  </div>
  </form>
  <div style ="text-align: center" >
  <img alt ="이미지"  src="${path}/resources/breakfast.jpg">
  </div>
  
  
</body>
</html>