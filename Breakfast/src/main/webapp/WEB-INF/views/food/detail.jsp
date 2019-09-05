<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <style>
 img{
    display: inline-block;
 }
</style> -->
</head>
<body>
<h1>주문하기</h1>
<h2>음식을 골라주세요.</h2>

<c:forEach items="${allfood}" var="food">
 <img src="${path}/resources/${food.pic}" width="150" height="150"/>
</c:forEach>
<script>


</script>

<form action="order" method="post">
<table border="1">
<caption>계란종류</caption>
<tr> 
 
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<c:forEach items="${foodlist_egg}" var="food">
  <tr>
    <td>${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="egg" value="${food.foodSequence}" ${food.menuName=='Scrambled'?'checked':''}></td>
  </tr>
</c:forEach>

</table>	
<table border="1">
<caption>소세지 &amp; 베이컨</caption>
<tr>
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<c:forEach items="${foodlist_meat}" var="food">
  <tr>
   <td>${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="meat" value="${food.foodSequence}" ${food.menuName=='Sausage'?'checked':''}></td>
  </tr>
</c:forEach>

</table>	
<table border="1">
<caption>팬케이크 &amp; 와플</caption>
<tr>
 
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<%
int count = 1;
%>
<c:forEach items="${foodlist_bread}" var="food">
	<tr>
   <td >${food.itemName}</td>
   <td >${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="bread" value="${food.foodSequence }" ${food.menuName=='Pancake'?'checked':''}></td>
  </tr>
</c:forEach>

</table>
<table border="1">
<caption>샐러드</caption>
<tr>
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<c:forEach items="${foodlist_salad}" var="food">
  <tr>
    <td>${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="salad" value="${food.foodSequence}" ${food.menuName=='Olive oil'?'checked':''} ></td>
  </tr>
</c:forEach>

</table>
<table border="1">
<caption>음료</caption>
<tr>
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<c:forEach items="${foodlist_drink}" var="food">
  <tr>
   <td>${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="drink" value="${food.foodSequence}"  ${food.menuName=='Milk'?"checked":""} ></td>
  </tr>
</c:forEach>

</table>
<table border="1">
<caption>주문방법</caption>
<tr>
 <td>menuName</td>
 <td>price</td>
 <td>선택</td>
</tr>
<c:forEach items="${foodlist_order}" var="food">
  <tr>
    <td>${food.menuName}</td>
   <td>${food.price}</td>
   <td><input type="radio" name="method" value="${food.foodSequence}" ${food.menuName=='Stay'?'checked':'' }></td>
  </tr>
</c:forEach>

</table>	
<input type="submit" value="주문하기">
</form>
</body>
</html>