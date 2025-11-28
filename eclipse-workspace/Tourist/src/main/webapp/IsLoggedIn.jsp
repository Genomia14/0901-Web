<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% System.out.println("로그인 체크: " + session.getAttribute("id"));%>
<% 
if(session.getAttribute("id") == null){
	// 세션에 UserId가 없으면 로그인페이지로 이동시키는 if문
	JSFunction.alertLocation("로그인 후 이용해주십시오", "login.jsp", out);
	
	return;
}
%>