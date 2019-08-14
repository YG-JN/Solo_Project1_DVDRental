<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
	function join() {
		location.href = '/view/joinView.jsp';
	}
</script>

<style type="text/css">
body {
	background-color: white
}

div_1 {
	align-content: center;
}
</style>




</head>

<!-- mainView.jsp -->

<body>



	<div id="div_1"
		style="float: left; width: 100%; height: 10%; background-Color: #F1C40F">

		<img src="/img/logo.jpg" border="2" width="10%" height="10%">

		<h3>강냉이</h3>

		<form action="/dvdProject/control?action=login" method="post">
			<%
				String name = (String) session.getAttribute("name");

				if ("success".equals(session.getAttribute("login"))) {
					session.setAttribute("email", session.getAttribute("info"));

					out.print("<input type='text' name='email' value='" + name + " 님 환영합니다~! '/>");
					out.print("<input type='submit' name='email' value='logout'/>");
					out.print("<input type='submit' name='email' value='MY'/>");
					out.print("<input type='button' name='category' value='영화예매' action='/dvdProject/control?action=category' method='post'/>");
			%>
			<%
				} else {
			%>
			<input type="text" name="email" placeholder="이메일 입력" /> 
			<input
				type="password" name="pass" placeholder="비밀번호 입력" /> 
				<input
				type="submit" name="loginButton" value="로그인"> <input
				type="button" id="joinButton" value="회원가입" onclick="join()">
		</form>
		<%
			}
		%>
	</div>

	<div
		style="float: left; width: 100%; height: 80%; background-Color: #FFFFF2">

		<img src="" border="1" width="100%" height="100%" alt="이미지 들어가는 부분">
		<p>메인부분</p>
	</div>
</body>
</html>