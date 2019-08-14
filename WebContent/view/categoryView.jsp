<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리</title>

<style type="text/css">
body {
	background-color: #F1C40F;
	text-align: center;
}
table{margin: auto;}
td,th{padding: 5px}
</style>
</head>
<body>
	<div style="float: center; width: 100%; height: 30%; background-Color: white">
		<p>카테고리</p>
	</div>
	
	<div style="float: center; width: 100%; height: 70%; background-Color: white">
		<table border="1">
			<tr>
				<th>영화번호</th>
				<th>영화장르</th>
				<th>영화명</th>
				<th>영화감독</th>
				<th>주연배우</th>
				<th>개봉일</th>
			</tr>
			<c:forEach items="${list }" var="movie">
			<tr>
				<td>${movie.movieNum }</td>
				<td>${movie.movieGenre }</td>
				<td>${movie.movieName }</td>
				<td>${movie.movieDirector }</td>
				<td>${movie.movieActor }</td>
				<td><fmt:formatDate value="${movie.movieOpenDate }" pattern="yyyy-MM-dd"/>  </td>
				<td><input type="button" value="구매"/></td> 
			</tr>
			</c:forEach>
			
		</table>
	</div>
</body>