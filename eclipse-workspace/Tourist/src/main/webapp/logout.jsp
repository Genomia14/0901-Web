<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
    // 세션에 id를 삭제
	session.removeAttribute("id");
	// 접속해 있는 사용자의 모든 세션 데이터를 삭제
	session.invalidate();
	// 세션 데이터 삭제 후 메인 페이지로 이동
	response.sendRedirect("Index.jsp");
%>