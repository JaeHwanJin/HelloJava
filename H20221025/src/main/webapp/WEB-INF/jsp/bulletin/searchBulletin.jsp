<%@page import="co.edu.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>

</head>
<body>
	<%
		BoardVO result = (BoardVO) request.getAttribute("board");
	%>
	<table border='1'> 
		<tr>
			<th>글번호</th><td>10</td>
			<th>작성자</th><td>user1</td>
		</tr>
		<tr>
			<th>제목</th><td><%=result.getTitle()%></td>
		</tr>
		<tr>
			<td colspan='2'>
			<textarea rows=5 cols=30><%=result.getContent() %></textarea>
			</td>
			<td>
				<img src="upload/<%=result.getImage()%>" alt="" style="width: 200px;">
			</td>
		</tr>
		<tr>
			<th>작성일자</th><td><%=result.getWriterDate() %></td>
			<th>조회수</th><td><%=result.getClickCnt() %></td>
		</tr>
	
	</table>
</body>
</html>