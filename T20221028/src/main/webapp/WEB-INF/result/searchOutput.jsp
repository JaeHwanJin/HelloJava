<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회 결과 페이지.</title>
</head>
<body>
	
	<% BookVO result = (BookVO) request.getAttribute("bookInfo"); %>
	
	<h3>조회결과페이지</h3>
	
	<table board="1">
		<caption>도서조회</caption>
        <thead>
            <tr>
                <th>도서코드</th>
                <th>도서명</th>
                <th>도서저자</th>
                <th>도서출판사</th>
                <th>도서가격</th>
            </tr>
        </thead>
        <tbody>
        	<tr>
        		<td><%=result.getBookCode() %></td>
        		<td><%=result.getBookTitle() %></td>
        		<td><%=result.getBookAuthor() %></td>
        		<td><%=result.getBookPress() %></td>
        		<td><%=result.getBookPrice() %></td>
        </tbody>
	</table>
	
    <a href="main.do">첫페이지</a>

</body>
</html>