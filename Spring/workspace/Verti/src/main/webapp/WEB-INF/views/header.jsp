<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<div id="header-wrapper">
    <header id="header" class="container">

        <div id="logo">
            <h1><a href="${pageContext.request.contextPath}/">Verti</a></h1>
            <span>With Your</span>
        </div>

        <nav id="nav">
            <ul>
                <li class="current"><a href="${pageContext.request.contextPath}/index.jsp#intro">소개</a></li>
                <li><a href="${pageContext.request.contextPath}/Beans.jsp">메뉴</a>
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/Beans.jsp">원두</a></li>
                        <li><a href="${pageContext.request.contextPath}/Coffee.jsp">커피</a></li>
                        <li><a href="${pageContext.request.contextPath}/Dessert.jsp">디저트</a></li>
                    </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/board/list">문의사항</a></li>

                <c:choose>
                    <c:when test="${not empty sessionScope.loginUser}">
                        <li><a href="${pageContext.request.contextPath}/user/logout">로그아웃</a></li>
                        <li><span>${sessionScope.loginUser.id}님, 반갑습니다.</span></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${pageContext.request.contextPath}/user/login">로그인</a></li>
                        <li><a href="${pageContext.request.contextPath}/user/join">회원가입</a></li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </nav>

    </header>
</div>
