<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="./SignUp.do" method="post" >
		아이디 : <input type="text" name="title"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		이름 : <input type="text" name="name"><br>
		이메일 : <input type="email" name="email"><br>
		<input type="submit" value="가입">
		<input type="reset" value="초기화"><br>
	
	</form>
</body>
</html>