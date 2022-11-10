<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>
	<div align="center">
		<div>
			<h1>상품 목록보기</h1>
		</div>
	
		<table border="1">
		<c:forEach items="${myshipping }" var="b">
			<tr>
			<td>${b.itemCode }</td>
			</tr>		
		
		</c:forEach>
			
		</table>

</body>
</html>