<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 보기</title>
    <link rel="stylesheet" href="/resources/assets/css/main.css"/>
    <style>
        #view-wrapper {
            max-width: 900px;
            margin: 50px auto;
            padding: 25px;
            background: #fff;
            border: 1px solid #ddd;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.05);
        }

        /* 제목 */
        #view-title {
            font-size: 26px; /* 기존 22px → 26px */
            font-weight: 700; /* 기존 bold → 700 */
            margin-bottom: 18px;
            color: #333;
        }

        /* 작성자 / 작성일 / 조회수 영역 */
        #view-info {
            display: flex;
            border-bottom: 1px solid #ccc;
            padding: 12px 0; /* 기존 10px → 12px */
            margin-bottom: 25px;
            background: #fff;
            font-size: 16px; /* 기존 14px → 16px */
            font-weight: 600; /* 조금 더 굵게 */
            color: #555;
        }

        #view-info div {
            padding: 0 12px; /* 기존 10px → 12px */
            border-right: 1px solid #ccc;
        }

        /* 각 칸 너비 조정 */
        #view-info .author {
            flex: 0 0 130px;
        }

        /* 작성자 칸 조금 넓힘 */
        #view-info .date {
            flex: 1;
        }

        /* 작성일 칸 */
        #view-info .views {
            flex: 0 0 90px;
            text-align: right;
        }

        /* 조회수 칸 조금 넓힘 */

        #view-info div:last-child {
            border-right: none;
        }

        /* 본문 내용 */
        #view-content {
            font-size: 18px; /* 기존 16px → 18px */
            line-height: 1.8; /* 기존 1.7 → 1.8 */
            white-space: pre-line;
            font-weight: 500; /* 본문도 조금 굵게 */
            color: #333;
            margin-bottom: 30px;
        }

        /* 버튼 */
        .view-buttons {
            text-align: center;
        }

        .view-buttons a {
            display: inline-block;
            margin: 0 12px;
            padding: 10px 20px;
            background: #3cadd4;
            color: #fff;
            text-decoration: none;
            border-radius: 4px;
            font-size: 16px;
            font-weight: 600;
            transition: background 0.3s;
        }

        .view-buttons a:hover {
            background: #37a0c5;
        }
    </style>

</head>
<body>
<div id="page-wrapper">
    <jsp:include page="/WEB-INF/views/header.jsp"/>

    <div id="view-wrapper">
        <!-- 제목 -->
        <div id="view-title">제목 : ${board.title}</div>

        <!-- 작성자 / 작성일 / 조회수 -->
        <div id="view-info">
            <div class="author">작성자: ${board.id}</div>
            <div class="date">작성일: ${board.postdate}</div>
            <div class="views">조회수: ${board.visitcount}</div>
        </div>

        <!-- 본문 내용 -->
        <div id="view-content">${board.content}</div>

        <!-- 버튼 -->
        <div class="view-buttons">
            <a href="${pageContext.request.contextPath}/board/list">목록</a>
            <c:if test="${isAuthor}">
                <a href="${pageContext.request.contextPath}/board/write?num=${board.num}">수정</a>
                <a href="${pageContext.request.contextPath}/board/delete?num=${board.num}"
                   onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
            </c:if>
        </div>
    </div>

    <jsp:include page="/WEB-INF/views/footer.jsp"/>
</div>
</body>
</html>
