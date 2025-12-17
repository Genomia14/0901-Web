<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시글 보기</title>
    <link rel="stylesheet" href="/resources/assets/css/main.css"/>

    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 25px;
            font-size: 16px; /* 전체 기본 글자 크기 ↑ (기존 14~15 → 16) */
        }

        table, th, td {
            border: 1px solid #ccc;
        }

        th {
            background-color: #f2f2f2;
            padding: 12px;
            text-align: center;
            width: 15%;
            font-size: 16px;      /* th 글자 크기 ↑ */
            font-weight: 700;
            vertical-align: middle;
        }

        td {
            padding: 14px;        /* 여백 조금 ↑ */
            text-align: left;
            color: black;
            font-size: 17px;      /* td 글자 크기 ↑ */
            vertical-align: top;  /* ⭐ 핵심: td 내용 위쪽 정렬 */
        }

        /* 내용 영역 */
        .content-box {
            min-height: 250px;    /* 기존 200 → 250 */
            white-space: pre-line;
            font-size: 18px;      /* 본문 글자 크게 */
            line-height: 1.8;
            vertical-align: top;  /* 내용 위쪽 정렬 */
        }

        /* 버튼 영역 */
        .button-area {
            margin-top: 25px;
            text-align: center;
        }

        .button-area a {
            display: inline-block;
            margin: 0 12px;
            padding: 10px 20px;
            background: #3cadd4;
            color: #fff;
            text-decoration: none;
            border-radius: 4px;
            font-weight: 700;
            font-size: 16px;      /* 버튼 글자도 ↑ */
        }

        .button-area a:hover {
            background: #37a0c5;
        }
    </style>

</head>

<body>
<div id="page-wrapper">
    <jsp:include page="/WEB-INF/views/header.jsp"/>

    <h2>게시글 보기</h2>

    <table>
        <tr>
            <th>번호</th>
            <td>${board.num}</td>
            <th>조회수</th>
            <td>${board.visitcount}</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${board.id}</td>
            <th>작성일</th>
            <td>${board.postdate}</td>
        </tr>
        <tr>
            <th>제목</th>
            <td colspan="3">${board.title}</td>
        </tr>
        <tr>
            <th>내용</th>
            <td colspan="3" class="content-box">
                ${board.content}
            </td>
        </tr>
    </table>

    <!-- 버튼 영역 -->
    <div class="button-area">
        <a href="${pageContext.request.contextPath}/board/list">목록</a>

        <c:if test="${isAuthor}">
            <a href="${pageContext.request.contextPath}/board/write?num=${board.num}">수정</a>
            <a href="${pageContext.request.contextPath}/board/delete?num=${board.num}"
               onclick="return confirm('정말 삭제하시겠습니까?');">
                삭제
            </a>
        </c:if>
    </div>

    <jsp:include page="/WEB-INF/views/footer.jsp"/>
</div>
</body>
</html>
