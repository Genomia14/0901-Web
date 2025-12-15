<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <link rel="stylesheet" href="/resources/assets/css/main.css" />
    <style>
        #login-box {
            max-width: 400px;
            margin: 80px auto;
            background: #fff;
            padding: 40px 30px;
            border-radius: 8px;
            box-shadow: 0 3px 15px rgba(0, 0, 0, 0.15);
        }

        #login-box h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #444;
            font-weight: 600;
        }

        .input-wrapper {
            margin-bottom: 20px;
        }

        .input-wrapper label {
            font-weight: bold;
            margin-bottom: 5px;
            display: block;
        }

        .input-wrapper input {
            width: 100%;
            padding: 12px 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        #login-button {
            width: 100%;
            padding: 12px;
            background: #3cadd4;
            border: none;
            color: #fff;
            font-weight: bold;
            border-radius: 4px;
            cursor: pointer;
            font-size: 1.05em;
        }

        #login-button:hover {
            background: #37a0c5;
        }

        .sub-links {
            text-align: center;
            margin-top: 15px;
        }

        .sub-links a {
            color: #3cadd4;
            text-decoration: none;
        }

        .alert-message {
            color: red;
            padding: 10px;
            border: 1px solid red;
            margin-bottom: 20px;
            text-align: center;
            background-color: #f8d7da;
        }
    </style>
</head>
<body>
<div id="page-wrapper">
    <jsp:include page="../header.jsp" />

    <c:if test="${not empty msg}">
        <div class="alert-message">${msg}</div>
    </c:if>

    <div id="login-box">
        <h2>로그인</h2>
        <form action="${pageContext.request.contextPath}/user/login" method="post">
            <div class="input-wrapper">
                <label for="id">아이디</label>
                <input type="text" name="id" id="id" required />
            </div>

            <div class="input-wrapper">
                <label for="password">비밀번호</label>
                <input type="password" name="password" id="password" required />
            </div>

            <button type="submit" id="login-button">로그인</button>
        </form>

        <div class="sub-links">
            <a href="/resources/user/join">회원가입</a>
        </div>
    </div>

    <jsp:include page="../footer.jsp" />
</div>
</body>
</html>
