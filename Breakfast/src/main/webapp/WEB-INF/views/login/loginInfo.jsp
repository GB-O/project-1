<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인정보</title>
</head>

<body>
	<c:if test="${result == 0}">
		<script type="text/javascript">
			location.href = "<c:url value='/food/select'/>";
		</script>
	
	</c:if>
	
	<c:if test="${result == 1}">
		<script type="text/javascript">
			location.href = "<c:url value='/login/login'/>";
		</script>
		
	</c:if>
	
	<c:if test="${result == 2}">
		<script type="text/javascript">
			location.href = "<c:url value='/login/login'/>";
		</script>
		
	</c:if>
</body>
</html>