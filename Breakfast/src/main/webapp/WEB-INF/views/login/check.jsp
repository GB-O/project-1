<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	
</script>
<body>
	<div style="text-align: center">
		<h2>중복확인</h2>
	</div>
	<hr>
	<form name="check" action="<c:url value='/login/check'/>" onsubmit="return checkId();">
	</form>	
</body>
</html>