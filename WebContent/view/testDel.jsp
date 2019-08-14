<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<h3>방명록: 리스트</h3>
	<style type="text/css">
     body{text-align: center}
     table{margin: auto;}
     td,th{padding: 5px}
  </style>
	<hr>
	
	<!--  <a href="http://localhost/TomTest/guest/control?action=form">방명록 쓰기</a>-->
	  <a href="control?action=form">방명록 쓰기</a>
	
	<br>
	<br>
	 <form>
	<table border="1" cellpadding="8">
	<tr bgcolor="skyblue">
		<th>번호</th><th>작성자</th><th>전화번호</th><th>작성일</th><th>내용</th>	 
	</tr>
	
	<%-- 아래 el을 안쓴다면
		 <%
      List<Guest>  list =   (List<Guest>)request.getAttribute("list");
        for(int i=0; i<list.size(); i++){
        	Guest guest = list.get(i);
        	out.print("<tr>");
        	out.print("<td>"+guest.getNo()+"</td>");
        	out.print("</tr>");
        }
    
    %>  이렇게 길게 나오고 오류도 많이 생긴다 ! 
    		getAttribute("list"); 가 items="${list }"이고 Guest guest = list.get(i);의 guest가  var="guest"이고
    		+guest.getNo()가 ${guest.no }이다! 
    
	 --%>
	
	  <%-- <% request.getAttribute("list") %> 와 같은것이다 ${list}가!! --%>
	 <c:forEach items="${list }" var="guest">
	 <tr>
	 <%-- ${fn:substring(guest.conntents,0,5) } --%>
	 	<td>${guest.no }</td>
	 	<td>${guest.writer }</td>
	 	<td>${guest.tel }</td>
	 	<!-- <td><fmt:formatDate value="${guest.wdate }" pattern="yyyy/mm/dd hh:mm:ss" /></td> -->
	 	<td><fmt:formatDate value="${guest.wdate }" pattern="yyyy-mm-dd" /></td>
	 	<td><a href="control?action=edit&no=${guest.no }" >${guest.contents }</a></td>
	 	<!--guest.contents.substring(0,5)  -->
	 	<%-- 
	 			JSP(자바) 요소 중 HTML 또는 JavaScript와 어울릴수 있는 요소는? 
	 			==> 표현식(출력식)!!
	 			==> Expression <%= %> 		Expression Language ${  } 
	 	 --%>
	 </tr>
	 </c:forEach>
	
	</table>
	  </form>
  <br>
  	
             <c:if test="${page==1 }">
	             	이전
             </c:if>

             <c:if test="${page>1 }">
         		 <a href="control?action=list&page=${page-1 }">이전</a>
             </c:if>

			 <%-- [미션]  마지막페이지에서  '다음'텍스트에 있는 하이퍼링크 제거하기!!  
			           ===> 컨트롤러에서 총 페이지를 구해서(totalPage)  ===> 영역에 저장
			           
			      [미션2] '이전'과 '다음'사이에  페이지 넘버(수)를 출력하고
                                        넘버클릭시 해당페이지로 이동하게 하이퍼링크 설정하시오.
			      --%>
			     
			<c:forEach begin="1" end="${totalPage }" var="i" step="1"> 
			[<a href="control?action=list&page=${i}">${i }</a>]			      
			</c:forEach>      
			        
			        
             <c:choose>
				<c:when test="${page < totalPage }">
	          		<a href="control?action=list&page=${page+1 }">다음</a>
				</c:when>             	
				<c:otherwise>
					다음				
				</c:otherwise>
             </c:choose>
  
	
	
	
</body>
</html>