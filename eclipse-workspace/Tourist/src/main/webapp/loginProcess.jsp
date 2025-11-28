<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@page import="utils.CookieManager"%>
<%@page import="javax.print.attribute.HashPrintRequestAttributeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 로그인시 필요한 파라미터
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	// 아이디 저장 기능 활성화 여부 확인변수
	String save_check = request.getParameter("save_check");
	// id와 pw가 DB와 일치하는지 확인하는 if문
	// DB연결
	MemberDAO dao= new MemberDAO();
	MemberDTO param = new MemberDTO();
	param.setEmailId(id);
	param.setPassword(pw);
	// 로그인 데이터 받기
	MemberDTO dto = dao.login(param);
	if (dto.getEmailId() != null && dto.getEmailId().equals(id)) {
		if (save_check != null && save_check.equals("Y")) {
			CookieManager.makeCookie(response, "loginId", id, 60*60*24*7);
		} else {
			CookieManager.deleteCookie(response, "loginId");
		}
		session.setAttribute("id", id);
		response.sendRedirect("Index.jsp");
	} else {
		request.getRequestDispatcher("login.jsp?loginErr=1").forward(request, response);
	}
	%>
</body>
</html>