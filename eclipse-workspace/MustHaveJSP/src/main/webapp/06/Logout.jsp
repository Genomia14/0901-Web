<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 각각의 세션 데이터 삭제
session.removeAttribute("User_Id");
session.removeAttribute("User_Name");

// 세션의 전체 데이터 삭제
session.invalidate();
// 세션 데이터 삭제 후로그인 페이지로 이동
response.sendRedirect("LoginForm.jsp");
%>