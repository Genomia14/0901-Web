<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="org.zerock.verti.dto.UserDTO" %>
<!DOCTYPE html>
<html>
<head>
    <title>Verti - 회원가입</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="/resources/assets/css/main.css" />

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" />

    <style>
        .form-wrapper {
            max-width: 420px;
            margin: 0 auto;
            padding: 10px;
        }

        .input-box {
            display: flex;
            align-items: center;
            border: 1px solid #dadada;
            padding: 12px 10px;
            margin-bottom: 12px;
        }

        .input-box i {
            margin-right: 10px;
            color: #777;
        }

        .input-box input {
            width: 100%;
            border: none;
            outline: none;
            font-size: 14px;
        }
    </style>
</head>
<body class="is-preload">
<div id="page-wrapper">
    <div id="main-wrapper">
        <div class="container">
            <div class="form-wrapper">
                <div id="logo">
                    <h1><a href="${pageContext.request.contextPath}/Index.jsp">Verti</a></h1>
                    <span>by HTML5 UP</span>
                </div>

                <h3 style="margin-bottom: 20px;">회원정보를 입력해주세요</h3>

                <form action="${pageContext.request.contextPath}/user/join" method="post">
                    <div class="input-box">
                        <i class="fa-regular fa-user"></i>
                        <input type="text" name="id" placeholder="아이디" required>
                    </div>

                    <div class="input-box">
                        <i class="fa-regular fa-envelope"></i>
                        <input type="email" name="email" placeholder="이메일" required>
                    </div>

                    <div class="input-box">
                        <i class="fa-solid fa-lock"></i>
                        <input type="password" name="password" placeholder="비밀번호" required>
                    </div>

                    <div class="input-box">
                        <i class="fa-solid fa-lock"></i>
                        <input type="password" name="passwordCheck" placeholder="비밀번호 확인" required>
                    </div>

                    <div class="input-box">
                        <i class="fa-regular fa-user"></i>
                        <input type="text" name="name" placeholder="이름" required>
                    </div>

                    <div class="input-box">
                        <i class="fa-solid fa-mobile-screen"></i>
                        <input type="text" name="phone" placeholder="휴대폰번호" required>
                    </div>

                    <button type="submit" class="button primary" style="width: 100%; margin-top: 20px;">
                        회원가입
                    </button>
                </form>

                <p style="font-size: 15px; text-align: center;">@Verti Corp. All rights reserved.</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
