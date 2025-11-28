<%@page import="membership.MemberDAO"%>
<%@page import="common.DBConnPool"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>회원 추가 테스트(executeUpdate() 사용)</h2>
   <%
   
   DBConnPool jdbc  = new DBConnPool();
   String id = "test2";
   String pass = "1111";
   String name = "테스트2회원";
   
   // DB 연결
   MemberDAO dao = new MemberDAO();
   dao.addMember(id,pass,name);
   // SQL의 ?의미 : SQL에 설정할 동적 데이터
   out.println("행이 입력되었습니다.");
   dao.close();
   %>
</body>
</html>