<%@page import="java.util.List"%>
<%@page import="co.edu.emp.EmpDAO"%>
<%@page import="co.edu.emp.EmployeeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
		<tr>
		<th>�����ȣ</th>
		<th>�̸�</th>
		<th>�̸���</th>
		<th>�Ի�����</th>
		<th>����</th>
		
		
	
	<%
		String name = "ȫ�浿";
		EmployeeVO emp = new EmployeeVO("IT_PROG");
		EmpDAO dao = new EmpDAO();
		
		List<EmployeeVO> list = dao.empList(emp);
		for(EmployeeVO vo : list){
	%>
	
		<tr>
		<td><%=vo.getEmployeeId() %></td>
		<td><%=vo.getLastName() %></td>
		<td><%=vo.getEmail() %></td>
		<td><%=vo.getHireDate() %></td>
		<td><%=vo.getJobId() %></td>
		
		
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>