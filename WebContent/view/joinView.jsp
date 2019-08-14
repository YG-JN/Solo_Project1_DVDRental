<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: #F1C40F;
}

div {
	margin: auto;
	padding-top: 5%;
	text-align: center;
}

table {
	margin: auto;
	padding-top: 10%;
	text-align: center;
}
</style>
</head>
<body>
	<div>
		<p>회원가입</p>
	</div>
	<form action="/dvdProject/control?action=join" method="post">
		<table>

			<tr>
				<td>email</td>
				<td><input type="text" name="email"></td>

			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>

			<tr>
				<td>주소</td>
				<td><input type="text" name="addr"></td>
			</tr>

			<tr>
				<td>연락처</td>
				<td><input type="text" name="tel" placeholder="숫자만 입력"/></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="가입"> 
				<!-- <input type="reset" value="취소"> -->
				<input type="reset" value="이전페이지" value="BACK" onClick="history.go(-1)"></td>
			</tr>
		</table>
	</form>

</body>
</html>