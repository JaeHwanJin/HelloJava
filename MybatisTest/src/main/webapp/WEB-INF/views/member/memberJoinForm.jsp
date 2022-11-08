<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>회원 가입</h1></div>
	<div>
		<form action="memberJoin.do" onsubmit="return formSubmit()" id="frm" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">아이디</th>
						<td width="270">
							<input type="text" id="id" name="id" required="required">&nbsp;&nbsp;
							<button id="btn" value="No" onclick="idCheck()">중복체크</button>
						</td>
					</tr>
					<tr>
						<th width="150">패스워드</th>
						<td width="230">
							<input type="password" id="passwd" name="passwd" required="required">
						</td>
						
					</tr>
					<tr>
						<th width="150">패스워드확인</th>
						<td width="230">
							<input type="password" id="passwd1" name="passwd1" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">이름</th>
						<td width="230">
							<input type="text" id="name" name="name" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">이메일</th>
						<td width="230">
							<input type="email" id="email" name="email" required="required">
						</td>
					</tr>
				</table>
			</div></br>
			<div>
				<input type="submit" value="회원가입">&nbsp;&nbsp;
				<input type="reset" value="취소">
			</div>
		</form>
	</div>
</div>
<script type="text/javascript">

	function formSubmit(){
		if(frm.btn.value == "No"){
			alert("이미 존재하는 아이디입니다.")
			return false;
		}
		if(frm.passwd.value != frm.passwd1.value){
			alert("패스워드가 확인값과 일치 하지 않습니다.")
			frm.passwd.value="";
			frm.passwd1.value="";
			frm.passwd.focus();
			return false;
		}
		return false;
	}
	
	function idCheck(){ // 아이디 중복체크
		let id = frm.id.value;
		let url = "ajaxIdCheck.do?id="+ id;
		fetch(url)
		.then(response => response.text())
		.then(data => {		// 결과처리함수
				if(data == '1'){
					alert(id + "은(는) 사용 가능한 아이디입니다.")
					frm.btn.value = 'Yes';
				} else if(data == '0'){
					alert(id + "은(는) 이미 존재하는 아이디입니다.")
					frm.id.valie = "";
					frm.id.focus();
				}
		})
		
	}
</script>
</body>
</html>