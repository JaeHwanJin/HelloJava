<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- 반복문 가져올때 c 로 호출-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록(memberList.jsp)</title>
	<style>
	tr{
		border : 1px solid blue;
	}
	th, td{
		border : 1px dotted red;
	}
	</style>
</head>
<body>
	<h3>회원목록</h3>
	<table border='1'>
		<tr>
			<td>회원id</td>
			<td>이름</td>
			<td>이메일</td>
			
		</tr>
		<c:forEach var="member" items="${list }">
			<tr>
				<td>${member.id}</td>
				<td>${member.name}</td>
				<td>${member.email}</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>
