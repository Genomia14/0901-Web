<%@ page import="org.zerock.verti.dto.UserDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");
    if(loginUser == null){
        session.setAttribute("returnURL","/board/write");
        response.sendRedirect(request.getContextPath() + "/user/login");
        return;
    }
%>


<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
    <link rel="stylesheet" href="/resources/assets/css/main.css" />
</head>
<body>
<div id="page-wrapper">
    <jsp:include page="/WEB-INF/views/header.jsp" />

    <div id="contact-wrapper">
        <div id="contact-form">
            <h2>글쓰기</h2>
            <form action="${pageContext.request.contextPath}/board/write" method="post">
                <div class="input-wrapper">
                    <label for="title">제목</label>
                    <input type="text" name="title" id="title" required />
                </div>
                <div class="input-wrapper">
                    <label for="content">내용</label>
                    <textarea name="content" id="content" required></textarea>
                </div>
                <button type="submit" id="submit-button">작성</button>
            </form>
        </div>
    </div>

    <jsp:include page="/WEB-INF/views/footer.jsp" />
</div>
</body>
</html>
