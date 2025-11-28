<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// removeAttribute(key) : 해당하는 데이터를 삭제
request.setAttribute("requestString", "request 영역의 문자열");
// 없는 key를 삭제해도 오류가 발생하지 않음
request.setAttribute("requestPerson", new Person("안중근", 31));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 영역</title>
</head>
<body>
	<h2>request 영역의 속성값 삭제하기</h2>
	<%
	// setAttribute(key, value) : 데이터 저장시 사용하는 메서드
	request.removeAttribute("requestString");
	request.removeAttribute("requestInteger");
	%>
	<h2>request 영역의 속성값 읽기</h2>
	<!-- getAttribute(key) : key에 해당하는 value를 출력하는 메서드 -->
	<!-- 객체 데이터의 경우 캐스팅을 이용하여 원래 객체로 변환하는 과정이 필요함 -->
	<%Person rPerson = (Person)(request.getAttribute("requestPerson"));%>
	<ul>
		<!-- 문자열, 숫자의 경우 캐스팅 과정 없이 출력 가능 -->
		<li>String 객체 : <%= request.getAttribute("requestString")%></li>
		<li>Person 객체 : <%= rPerson.getName()%>,<%= rPerson.getAge()%></li>
	</ul>
	<h2>포워드된 페이지에서 request 영역 속성 값 읽기</h2>
	<%
	 // 위에서 생성한 Person 데이터는 request에 저장되어있기 때문에
	 // forward사용시 다음 페이지에서도 사용 가능
	request
	.getRequestDispatcher("RequestForward.jsp?paramHan=한글&paramEng=English")
	.forward(request,response); %>
</body>
</html>