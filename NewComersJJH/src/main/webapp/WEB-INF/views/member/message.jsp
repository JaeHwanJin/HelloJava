<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>판매 자격을 신청하시겠습니까?</h3><br>
	<button type="button" id="okBtn" name="okBtn" value="okBtn" onclick="apply();">신청</button>
	<button type="button" id="noBtn" name="noBtn" value="noBtn" onclick="window.close();">취소</button>

<script type="text/javascript">

	function apply(){
		
		alert("신청이 완료되었습니다.");
		return window.close();
	}

</script>
</body>
</html>