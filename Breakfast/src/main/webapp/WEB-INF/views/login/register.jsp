<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register </title>
</head>
	<script type="text/javascript">
		function check() {
			if(!document.registerForm.cId.value) {
				alert("아이디를 입력하세요");
				return false;
			} else if(!document.registerForm.cPassword.value) {
				alert("비밀번호를 입력하세요");
				return false;
			} else if(!document.registerForm.cname.value) {
				alert("이름을 입력하세요");
				return false;
			} else if(!document.registerForm.phoneNumber.value) {
				alert("전화번호를 입력하세요");
				return false;
			} else if(!document.registerForm.address.value) {
				alert("주소를 입력하세요");
				return false;
		}
	}
	</script>
			
<body>
	<div style="text-align: center">
	<h2>아래 정보를 적어주세요.</h2>
	</div>
	<hr>
	<div style="text-align: center">
	<h3>회원가입</h3>
	<form action="register" method="post">
	아이디: <input type="text" id="cId" name="cId" placeholder="ID"><br>
	비밀번호: <input type="password" id="cPassword" name="cPassword" placeholder="Password"><br>
	이름 : <input type="text" id="cname" name="cname" placeholder="이름"><br>
	전화번호 : <input type="text" id="phoneNumber"  name="phoneNumber" placeholder="전화번호"><br>
	주소 : <input type="text" id="address" name="address" placeholder="주소"><br><br>
	
	<input type ="submit" value="회원가입">
	<p>아이디가 있을 경우 <a href="/myapp/login/login">여기</a>를 눌러주세요.</p>
	</form>
    </div>
</body>
</html>